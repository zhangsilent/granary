package com.example.granary.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class report {
    private double CO2s;
    private double Tem;
    private double O2s;
    private double margins;
    private double humiditys;
    private String times;

    @JsonProperty("CO2s")
    public double getCO2s() {
        return CO2s;
    }

    public void setCO2s(double CO2s) {
        this.CO2s = CO2s;
    }

    @JsonProperty("Tem")
    public double getTem() {
        return Tem;
    }

    public void setTem(double tem) {
        Tem = tem;
    }

    @JsonProperty("O2s")
    public double getO2s() {
        return O2s;
    }

    public void setO2s(double o2s) {
        O2s = o2s;
    }

    @JsonProperty("margins")
    public double getMargins() {
        return margins;
    }

    public void setMargins(double margins) {
        this.margins = margins;
    }

    @JsonProperty("humiditys")
    public double getHumiditys() {
        return humiditys;
    }

    public void setHumiditys(double humiditys) {
        this.humiditys = humiditys;
    }

    @JsonProperty("times")
    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }
}
