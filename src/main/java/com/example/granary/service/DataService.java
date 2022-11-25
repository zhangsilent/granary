package com.example.granary.service;

import com.example.granary.domain.Data;
import com.example.granary.domain.report;

import java.util.List;
public interface DataService {
    List<report> findAllData();
    List<Data> findnewData();
}
