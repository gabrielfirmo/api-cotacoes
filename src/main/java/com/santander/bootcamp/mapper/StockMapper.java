package com.santander.bootcamp.mapper;

import com.santander.bootcamp.model.Stock;
import com.santander.bootcamp.model.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<StockDTO> toDto(List<Stock> listStock){
        return listStock.stream().map(this::toDto).collect(Collectors.toList());
    }
}
