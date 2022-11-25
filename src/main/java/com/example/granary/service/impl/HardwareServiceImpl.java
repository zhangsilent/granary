package com.example.granary.service.impl;

import com.example.granary.dao.IHardware;
import com.example.granary.domain.Data;
import com.example.granary.service.HardwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardwareServiceImpl implements HardwareService {
    @Autowired
    private IHardware iHardware;
    @Override
    public void Hardware(Data data) {
        try {
            iHardware.Hardware(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
