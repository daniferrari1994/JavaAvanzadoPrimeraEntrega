package com.atencionMedica.pacientes.services;

import com.atencionMedica.pacientes.entity.Pacientes;

import java.util.List;

public interface pacientesService {
    List<Pacientes> getPacientes();
    List<Pacientes> postPacientes(Pacientes pacientes);
}
