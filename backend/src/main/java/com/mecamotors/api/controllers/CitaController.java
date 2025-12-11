package com.mecamotors.api.controllers;

import com.mecamotors.api.dtos.CitaDTO;
import com.mecamotors.api.entities.enums.EstadoCita;
import com.mecamotors.api.entities.models.Cita;
import com.mecamotors.api.mappers.CitaMapper;
import com.mecamotors.api.services.CitaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
@RequiredArgsConstructor
public class CitaController {

    private final CitaService citaService;
    private final CitaMapper citaMapper; // Inyectamos el mapper

    @PostMapping
    public ResponseEntity<CitaDTO> agendarCita(@RequestBody CitaDTO dto) {
        // El servicio retorna Entidad, nosotros la convertimos a DTO
        Cita nuevaCita = citaService.crearCita(dto);
        return ResponseEntity.ok(citaMapper.toDto(nuevaCita));
    }

    @GetMapping
    public ResponseEntity<List<CitaDTO>> listarCitas() {
        List<Cita> citas = citaService.listarTodas();
        return ResponseEntity.ok(citaMapper.toDtoList(citas));
    }

    @PatchMapping("/{id}/estado")
    public ResponseEntity<CitaDTO> cambiarEstado(@PathVariable Long id, @RequestParam EstadoCita estado) {
        Cita citaActualizada = citaService.actualizarEstado(id, estado);
        return ResponseEntity.ok(citaMapper.toDto(citaActualizada));
    }
}