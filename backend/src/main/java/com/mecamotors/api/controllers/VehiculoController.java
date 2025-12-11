package com.mecamotors.api.controllers;

import com.mecamotors.api.dtos.VehiculoDTO;
import com.mecamotors.api.services.VehiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
@RequiredArgsConstructor
public class VehiculoController {

    private final VehiculoService vehiculoService;

    @PostMapping
    public ResponseEntity<VehiculoDTO> registrarVehiculo(@RequestBody VehiculoDTO dto) {
        return ResponseEntity.ok(vehiculoService.registrarVehiculo(dto));
    }

    @GetMapping("/placa/{placa}")
    public ResponseEntity<VehiculoDTO> buscarPorPlaca(@PathVariable String placa) {
        return ResponseEntity.ok(vehiculoService.buscarPorPlaca(placa));
    }

    @GetMapping("/cliente/{clienteId}")
    public ResponseEntity<List<VehiculoDTO>> listarPorCliente(@PathVariable Long clienteId) {
        return ResponseEntity.ok(vehiculoService.listarPorCliente(clienteId));
    }
}