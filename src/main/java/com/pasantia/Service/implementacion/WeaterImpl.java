package com.pasantia.Service.implementacion;

import com.pasantia.Model.dto.WeatherResponse;
import com.pasantia.Service.IWeater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeaterImpl implements IWeater {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${app.api_key}")
    private String apiKey;

    @Value("${app.url}")
    private String apiUrl;

    @Override
    public ResponseEntity<?> getWeather() {
        String fullUrl = apiUrl + "/data/2.5/weather?lat=-17.78629&lon=-63.18117&appid=" + apiKey;
        try {
            WeatherResponse response = restTemplate.getForObject(fullUrl, WeatherResponse.class);
            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (RestClientException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
