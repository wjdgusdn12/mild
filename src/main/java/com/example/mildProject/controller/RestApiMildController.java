package com.example.mildProject.controller;

import java.util.List;

import com.example.mildProject.domain.MildListDto;
import com.example.mildProject.service.MildService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiMildController {
    @Autowired
    private MildService mildService;

    @RequestMapping(value="/api/mild",method = RequestMethod.GET)
    public List<MildListDto> openMildList() throws Exception{
        return mildService.selectMildList();
    }

    
}
