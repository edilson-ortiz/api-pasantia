package com.pasantia.Model.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
public class Clouds {
    @JsonProperty("all")
    private int all;
}
