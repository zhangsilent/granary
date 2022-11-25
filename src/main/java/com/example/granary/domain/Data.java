package com.example.granary.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class Data{
    private double CO2;
    private double T;
    private double O2;
    private double margin;
    private double humidity;
    private Timestamp time;
    @JsonProperty("CO2")
    public void setCO2(double CO2) {
        this.CO2 = CO2;
    }

    public double getCO2() {
        return CO2;
    }

    @JsonProperty("T")
    public void setT(double T) {
        this.T = T;
    }

    public double getT() {
        return T;
    }

    @JsonProperty("O2")
    public void setO2(double O2) {
        this.O2 = O2;
    }

    public double getO2() {
        return O2;
    }

    @JsonProperty("margin")
    public void setMargin(double margin) {
        this.margin = margin;
    }

    public double getMargin() {
        return margin;
    }

    @JsonProperty("humidity")
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getHumidity() {
        return humidity;
    }

    @JsonProperty("time")
    public void setTime(Timestamp time) {
        this.time = time;
    }

    @JsonFormat(timezone="GMT+8", pattern="HH:00")
    public Timestamp getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Data{" +
                "CO2=" + CO2 +
                ", T=" + T +
                ", O2=" + O2 +
                ", margin=" + margin +
                ", humidity=" + humidity +
                ", time=" + time +
                '}';
    }
}