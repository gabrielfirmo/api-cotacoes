package com.santander.bootcamp.mapper;

import com.santander.bootcamp.model.Stock;
import com.santander.bootcamp.model.dto.StockDTO;
import org.springframework.stereotype.Component;

@Component
public class StockMapper {
    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setDate(dto.getDate());
        stock.setName(dto.getName());
        stock.setId(dto.getId());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());

        return stock;
    }

    public StockDTO toDto(Stock stock) {
        StockDTO dto = new StockDTO();
        dto.setDate(stock.getDate());
        dto.setName(stock.getName());
        dto.setId(stock.getId());
        dto.setPrice(stock.getPrice());
        dto.setVariation(stock.getVariation());

        return dto;
    }
}
