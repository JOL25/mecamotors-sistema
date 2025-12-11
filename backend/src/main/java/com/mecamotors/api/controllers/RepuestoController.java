package com.mecamotors.api.controllers;

import com.mecamotors.api.dtos.RepuestoDTO;
import com.mecamotors.api.entities.models.Repuesto;
import com.mecamotors.api.mappers.RepuestoMapper;
import com.mecamotors.api.services.RepuestoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/repuestos")
@RequiredArgsConstructor
public class RepuestoController {

    private final RepuestoService repuestoService;
    private final RepuestoMapper repuestoMapper; // Inyectamos el mapper

    @GetMapping
    public ResponseEntity<List<RepuestoDTO>> listarInventario() {
        List<Repuesto> entidades = repuestoService.listarTodos();
        return ResponseEntity.ok(repuestoMapper.toDtoList(entidades));
    }

    @PostMapping
    public ResponseEntity<RepuestoDTO> crearRepuesto(@RequestBody RepuestoDTO dto) {
        Repuesto guardado = repuestoService.crearRepuesto(dto);
        return ResponseEntity.ok(repuestoMapper.toDto(guardado));
    }
}