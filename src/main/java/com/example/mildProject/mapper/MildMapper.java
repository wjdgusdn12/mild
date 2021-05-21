package com.example.mildProject.mapper;

import java.util.List;

import com.example.mildProject.domain.MildListDto;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MildMapper {
    List<MildListDto> selectMildList() throws Exception;
    //test
}
