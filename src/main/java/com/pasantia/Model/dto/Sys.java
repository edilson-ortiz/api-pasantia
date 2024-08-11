package com.pasantia.Model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
public class Sys {
    private int type;
    private int id;
    private String country;
    private long sunrise;
    private long sunset;
}
