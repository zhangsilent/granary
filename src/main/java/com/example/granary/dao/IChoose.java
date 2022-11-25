package com.example.granary.dao;

import com.example.granary.domain.Data;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IChoose {

    @Select("select T,humidity,CO2,O2 from kind where (name = 'wheat')")
    List<Data> ChooseWheat();

    @Select("select T,humidity,CO2,O2 from kind where (name = 'rice')")
    List<Data> ChooseRice();

    @Select("select T,humidity,CO2,O2 from kind where (name = 'soybean')")
    List<Data> ChooseSoybean();

    @Select("select T,humidity,CO2,O2 from kind where (name = 'maize')")
    List<Data> ChooseMaize();
}
