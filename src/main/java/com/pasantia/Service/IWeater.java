package com.pasantia.Service;

import org.springframework.http.ResponseEntity;

public interface IWeater {
    public ResponseEntity<?> getWeather();
}
