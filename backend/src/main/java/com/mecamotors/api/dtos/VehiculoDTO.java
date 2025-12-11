package com.mecamotors.api.dtos;

import lombok.Data;

@Data
public class VehiculoDTO {
    private Long id;
    private String placa;
    private String marca;
    private String modelo;
    private Integer anio;
    private String color;
    private Long clienteId; // Solo el ID para relacionar
    private String nombreCliente; // Útil para mostrar en tablas del frontend
}