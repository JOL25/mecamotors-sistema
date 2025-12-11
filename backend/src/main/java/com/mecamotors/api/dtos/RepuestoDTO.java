package com.mecamotors.api.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RepuestoDTO {
    private Long id;
    private String nombre;
    private String sku;
    private BigDecimal precioVenta;
    private Integer stockActual;
}