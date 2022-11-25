package com.example.granary.dao;

import com.example.granary.domain.Data;
import com.example.granary.domain.report;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Ireport {
    @Select("SELECT\n" +
            "\tROUND(AVG( T ),2) Tem,\n" +
            "\tROUND(AVG( CO2 ),2) CO2s,\n" +
            "\tROUND(AVG( O2 ),2) O2s,\n" +
            "\tROUND(AVG( humidity ),2) humiditys,\n" +
            "\ttimes\n" +
            "FROM\n" +
            "\t(\n" +
            "\tSELECT\n" +
            "\t\tT,\n" +
            "\t\tCO2,\n" +
            "\t\tO2,\n" +
            "\t\thumidity,\n" +
            "\t\tDATE_FORMAT( CONCAT( DATE( TIME ), ' ', FLOOR( HOUR ( TIME ) ) ) ,'%H:00' ) AS times\n" +
            "\tFROM\n" +
            "\t\tgranary WHERE TO_DAYS(TIME) = TO_DAYS(NOW())\n" +
            "\t\t) AS granarys\n" +
            "GROUP BY\n" +
            "\ttimes")
    List<report> findAllData();
}
