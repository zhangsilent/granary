package com.example.granary.controller;

import com.example.granary.domain.Data;
import com.example.granary.service.DataService;
import com.example.granary.service.KindService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Choose")
public class Choose {
    @Autowired
    KindService kindService;

    @RequestMapping("/wheat.action")
    @ResponseBody
    public void ChooseWheat(){
        String data1 = "";
        try {
            data1 = new ObjectMapper().writeValueAsString(kindService.ChooseWheat());
            System.out.println(data1);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("/rice.action")
    @ResponseBody
    public void ChooseRice(){
        String data2 = "";
        try {
            data2 = new ObjectMapper().writeValueAsString(kindService.ChooseRice());
            System.out.println(data2);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/soybean.action")
    @ResponseBody
    public void ChooseSoybean(){
        String data3 = "";
        try {
            data3 = new ObjectMapper().writeValueAsString(kindService.ChooseSoybean());
            System.out.println(data3);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/maize.action")
    @ResponseBody
    public void ChooseMaize(){
        String data4 = "";
        try {
            data4 = new ObjectMapper().writeValueAsString(kindService.ChooseMaize());
            System.out.println(data4);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
