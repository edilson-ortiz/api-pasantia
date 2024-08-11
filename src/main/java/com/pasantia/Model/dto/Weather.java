package com.pasantia.Model.dto;

import lombok.*;

@Data
public class Weather {
    private int id;
    private String main;
    private String description;
    private String icon;
}
