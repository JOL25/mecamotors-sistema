package com.mecamotors.api.repositories;

import com.mecamotors.api.entities.enums.EstadoCita;
import com.mecamotors.api.entities.models.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CitaRepository extends JpaRepository<Cita, Long> {
    // Para el calendario del recepcionista: Citas en un rango de fechas
    List<Cita> findByFechaHoraBetween(LocalDateTime inicio, LocalDateTime fin);

    // Ver historial de citas de un cliente
    List<Cita> findByClienteId(Long clienteId);

    // Ver citas pendientes o confirmadas
    List<Cita> findByEstado(EstadoCita estado);
}