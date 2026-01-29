package com.WeatherApi.WeatherApp.dto;

public class WeatherResopnse {
    private String city;
    private String country;
    private String reason;
    private String condition;
    private Double temperature;

    public WeatherResopnse(String city, String country, String reason, String condition, Double temperature) {
        this.city = city;
        this.country = country;
        this.reason = reason;
        this.condition = condition;
        this.temperature = temperature;
    }

    public WeatherResopnse() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getTemprature() {
        return temperature;
    }

    public void setTemprature( Double temperature) {
        this.temperature = temperature;
    }
}
