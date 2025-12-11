package com.mecamotors.api.repositories;

import com.mecamotors.api.entities.models.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
    // Búsqueda rápida por placa (para cuando llega el auto al taller)
    Optional<Vehiculo> findByPlaca(String placa);

    // Ver todos los autos de un cliente específico
    List<Vehiculo> findByClienteId(Long clienteId);
}