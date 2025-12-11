package com.mecamotors.api.dtos;

import lombok.Data;

import java.util.List;

@Data
public class ClienteDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private List<VehiculoDTO> vehiculos;
}