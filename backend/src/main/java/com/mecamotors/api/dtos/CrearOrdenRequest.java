package com.mecamotors.api.dtos;

import lombok.Data;

import java.util.List;

@Data
public class CrearOrdenRequest {
    private Long vehiculoId;
    private Long mecanicoId;
    private String diagnosticoInicial;
    private List<DetalleOrdenDTO> detallesIniciales;
}