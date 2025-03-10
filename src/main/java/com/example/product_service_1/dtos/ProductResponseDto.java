package com.example.product_service_1.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
    private Long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}