package com.example.granary.dao;
import com.example.granary.domain.Data;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
@Repository
public interface IData {
    //实时数据
    @Select("SELECT CO2,O2,T,humidity,margin FROM granary WHERE TIME = (SELECT MAX(TIME) FROM granary)")
     List<Data> findnewData();
}
