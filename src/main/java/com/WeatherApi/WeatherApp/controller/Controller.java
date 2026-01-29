package com.WeatherApi.WeatherApp.controller;

import com.WeatherApi.WeatherApp.dto.Root;
import com.WeatherApi.WeatherApp.dto.WeatherResopnse;
import com.WeatherApi.WeatherApp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class Controller {
@Autowired
    private WeatherService weatherService;
@GetMapping("my/{city}")
  public WeatherResopnse getWeather(@PathVariable String city){
      return weatherService.getData(city);
  }

}
