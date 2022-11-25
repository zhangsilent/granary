package com.example.granary.controller;

import com.example.granary.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/Control")
public class change {
    @Autowired
    DataService dataService;
    @RequestMapping("/subT.action")
    @ResponseBody
    public void control_subT(@RequestParam Map<String,Object> map){
        System.out.println(map.get("a"));
    }

    @RequestMapping("/addT.action")
    @ResponseBody
    public void control_addT(@RequestParam Map<String,Object> maps){
        System.out.println(maps.get("a"));
    }

    @RequestMapping("/addH.action")
    @ResponseBody
    public void control_addH(@RequestParam Map<String,Object> maps){
        System.out.println(maps.get("b"));
    }

    @RequestMapping("/subH.action")
    @ResponseBody
    public void control_sunH(@RequestParam Map<String,Object> maps){
        System.out.println(maps.get("b"));
    }
}
