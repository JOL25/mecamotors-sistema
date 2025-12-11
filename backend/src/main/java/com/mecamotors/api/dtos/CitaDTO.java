package com.mecamotors.api.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CitaDTO {
    private Long id;
    private LocalDateTime fechaHora;
    private String motivo;
    private String estado; // PENDIENTE, CONFIRMADA, etc...

    // Datos para mostrar en pantalla
    private String clienteNombre;
    private String vehiculoPlaca;
    private String vehiculoModelo;

    // Datos para crear/actualizar (Input)
    private Long clienteId;
    private Long vehiculoId;
}