package com.toyproject.flatmate.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    
    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder
            .create()
            .username("root")
            .password("1234")
            .url("jdbc:mysql://localhost:3306/flatmate?serverTimezone=UTC&allowPublicKeyRetrieval=true")
            .driverClassName("com.mysql.cj.jdbc.Driver")
            .build();
    }
}
