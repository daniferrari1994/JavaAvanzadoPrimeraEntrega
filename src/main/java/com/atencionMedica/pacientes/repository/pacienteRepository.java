package com.atencionMedica.pacientes.repository;

import com.atencionMedica.pacientes.entity.Pacientes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface pacienteRepository extends JpaRepository<Pacientes, Long> {
}
