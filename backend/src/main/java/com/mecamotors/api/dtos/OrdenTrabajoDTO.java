package com.mecamotors.api.dtos;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrdenTrabajoDTO {
    private Long id;
    private String fechaIngreso; // String formateado o LocalDateTime
    private String estado;
    private String diagnostico;

    // Información clave
    private String placaVehiculo;
    private String marcaVehiculo;
    private String nombreMecanico;

    // Totales
    private BigDecimal totalEstimado;

    // La lista de detalles (Solo se carga si es necesario)
    private List<DetalleOrdenDTO> detalles;
}