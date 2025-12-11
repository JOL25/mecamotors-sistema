package com.mecamotors.api.repositories;

import com.mecamotors.api.entities.models.Rol;
import com.mecamotors.api.entities.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Long> {
    // Para asignar roles por su nombre (ej. ROL_MECANICO)
    Optional<Rol> findByNombre(RolNombre nombre);
}