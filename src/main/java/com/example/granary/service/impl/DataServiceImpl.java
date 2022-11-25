package com.example.granary.service.impl;
import com.example.granary.dao.IData;
import com.example.granary.dao.Ireport;
import com.example.granary.domain.Data;
import com.example.granary.domain.report;
import com.example.granary.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private IData iData;
    @Autowired
    private Ireport ireport;
    @Override
    public List<report> findAllData() {
        return ireport.findAllData();
    }
    @Override
    public List<Data> findnewData(){
        return iData.findnewData();
    }

}
