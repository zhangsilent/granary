package com.example.granary.service;

import com.example.granary.domain.Data;

import java.util.List;

public interface KindService {
    List<Data> ChooseWheat();

    List<Data> ChooseRice();

    List<Data> ChooseSoybean();

    List<Data> ChooseMaize();
}
