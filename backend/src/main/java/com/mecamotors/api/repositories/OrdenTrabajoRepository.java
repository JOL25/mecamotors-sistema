package com.mecamotors.api.repositories;

import com.mecamotors.api.entities.enums.EstadoOrden;
import com.mecamotors.api.entities.models.OrdenTrabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdenTrabajoRepository extends JpaRepository<OrdenTrabajo, Long> {
    // Para el tablero del mecánico/jefe de taller
    List<OrdenTrabajo> findByEstado(EstadoOrden estado);

    // Historial de reparaciones de un vehículo
    List<OrdenTrabajo> findByVehiculoId(Long vehiculoId);

    // Tareas asignadas a un mecánico específico
    List<OrdenTrabajo> findByMecanicoId(Long mecanicoId);

    // Buscar orden activa por placa del vehículo
    @Query("SELECT o FROM OrdenTrabajo o WHERE o.vehiculo.placa = :placa AND o.estado <> 'ENTREGADO'")
    List<OrdenTrabajo> findOrdenesActivasPorPlaca(String placa);
}