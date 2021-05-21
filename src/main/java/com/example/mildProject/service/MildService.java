package com.example.mildProject.service;

import java.util.List;

import com.example.mildProject.domain.MildListDto;

public interface MildService {
    List<MildListDto> selectMildList() throws Exception;
}