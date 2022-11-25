package com.example.granary.controller;

import com.example.granary.domain.Data;
import com.example.granary.service.HardwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/Hardware")
public class HardwareData {
    @Autowired
    private HardwareService hardwareService;
    @RequestMapping("/into.action")
    @ResponseBody
    public void Hardware(Data data){
        hardwareService.Hardware(data);
    }
}
