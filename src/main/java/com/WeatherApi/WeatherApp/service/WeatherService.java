package com.WeatherApi.WeatherApp.service;

import com.WeatherApi.WeatherApp.dto.Root;
import com.WeatherApi.WeatherApp.dto.WeatherResopnse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${Weather.api.key}")
    private String apiKey;
    @Value("${Weather.api.url}")
    private String apiUrl;
    public RestTemplate template=new RestTemplate();
    public WeatherResopnse getData(String city){
        String url=apiUrl+"?key="+apiKey+"&q="+city;
        Root response= template.getForObject(url, Root.class);
        WeatherResopnse weatherResopnse=new WeatherResopnse();
        String cit=response.getLocation().name;
        String region=response.getLocation().region;
        String country=response.getLocation().country;
        weatherResopnse.setCity(cit);
        weatherResopnse.setReason(region);
        weatherResopnse.setCountry(country);
       String condition = response.getCurrent().getCondition().getText();
        weatherResopnse.setCondition(condition);
        weatherResopnse.setTemprature(response.getCurrent().getTemp_c());


        return weatherResopnse;




    }



}
