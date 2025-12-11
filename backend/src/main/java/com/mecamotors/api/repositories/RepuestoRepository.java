package com.mecamotors.api.repositories;

import com.mecamotors.api.entities.models.Repuesto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RepuestoRepository extends JpaRepository<Repuesto, Long> {
    Optional<Repuesto> findBySku(String sku);

    // Para reportes: Listar repuestos con stock bajo
    List<Repuesto> findByStockActualLessThanEqual(Integer stockMinimo);

    // Búsqueda flexible por nombre
    List<Repuesto> findByNombreContainingIgnoreCase(String nombre);
}