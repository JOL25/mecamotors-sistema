package com.mecamotors.api.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DetalleOrdenDTO {
    private Long id;
    private String tipo; // REPUESTO o SERVICIO
    private Long repuestoId; // Null si es mano de obra
    private String descripcion;
    private Integer cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal subtotal;
}