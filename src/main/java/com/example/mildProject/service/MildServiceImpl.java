package com.example.mildProject.service;

import java.util.List;

import com.example.mildProject.domain.MildListDto;
import com.example.mildProject.mapper.MildMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MildServiceImpl implements MildService {
   
   
    @Autowired
    private MildMapper mildMapper;  

    @Override 
    public List<MildListDto> selectMildList() throws Exception {
  
        return mildMapper.selectMildList();
    }
    
}
