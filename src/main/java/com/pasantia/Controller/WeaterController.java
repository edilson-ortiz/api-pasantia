package com.pasantia.Controller;

import com.pasantia.Model.dto.Weather;
import com.pasantia.Model.dto.WeatherResponse;
import com.pasantia.Service.IWeater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/")
public class WeaterController {

    @Autowired
    private IWeater weaterService;


    @GetMapping("weater")
    public ResponseEntity<?> show(){
            return weaterService.getWeather();
    }
}
