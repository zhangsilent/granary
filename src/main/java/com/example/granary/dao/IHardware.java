package com.example.granary.dao;

import com.example.granary.domain.Data;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface IHardware {
    @Insert("INSERT INTO granary(CO2) VALUES (#{CO2})")
    void Hardware(Data data);
}
