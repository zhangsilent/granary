package com.example.granary.controller;

import com.example.granary.service.DataService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Data")
public class Datacontroller {
    @Autowired
    DataService dataService;
    @RequestMapping("/report.action")
    @ResponseBody
    public String getData(){
        String data = "";


        try {
            data =new ObjectMapper().writeValueAsString(dataService.findAllData());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        return data;
    }
    @RequestMapping("/newData.action")
    @ResponseBody
public String getT(){
        String data="";
        try {
            data = new ObjectMapper().writeValueAsString(dataService.findnewData());
            System.out.println(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return data;
    }
}
