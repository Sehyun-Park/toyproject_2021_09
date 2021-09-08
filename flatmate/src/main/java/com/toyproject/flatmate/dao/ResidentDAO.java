package com.toyproject.flatmate.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.toyproject.flatmate.dto.ResidentDTO;

@Mapper
public interface ResidentDAO {
    public List<ResidentDTO> getResident_id();
}
