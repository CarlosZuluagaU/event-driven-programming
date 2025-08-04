package com.event.app.event;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductSoldedEvent {
    private String product;
    private int stock;
    private String codigo_de_barras ;
}
