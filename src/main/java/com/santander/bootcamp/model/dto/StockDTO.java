package com.santander.bootcamp.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class StockDTO {

    private Long id;
    private String name;
    private Double price;
    private LocalDate date;
    private Double variation;
}
