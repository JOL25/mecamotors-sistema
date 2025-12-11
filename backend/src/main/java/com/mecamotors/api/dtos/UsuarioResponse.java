package com.mecamotors.api.dtos;

import lombok.Data;

@Data
public class UsuarioResponse {
    private Long id;
    private String username;
    private String email;
    private String rol; // Devolvemos el nombre del rol (ADMIN, MECANICO, etc.)
}