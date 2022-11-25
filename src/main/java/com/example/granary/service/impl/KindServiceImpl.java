package com.example.granary.service.impl;

import com.example.granary.dao.IChoose;
import com.example.granary.dao.IData;
import com.example.granary.domain.Data;
import com.example.granary.service.KindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KindServiceImpl implements KindService {
    @Autowired
    private IChoose iChoose;
    @Override
    public List<Data> ChooseWheat(){
        return iChoose.ChooseWheat();
    }

    @Override
    public List<Data> ChooseRice(){
        return iChoose.ChooseRice();
    }

    @Override
    public List<Data> ChooseSoybean() {
        return iChoose.ChooseSoybean();
    }

    @Override
    public List<Data> ChooseMaize() {
        return iChoose.ChooseMaize();
    }
}
