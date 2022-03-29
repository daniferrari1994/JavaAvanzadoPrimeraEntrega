package com.atencionMedica.pacientes.services.impl;


import com.atencionMedica.pacientes.entity.Pacientes;
import com.atencionMedica.pacientes.repository.pacienteRepository;
import com.atencionMedica.pacientes.services.pacientesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class pacientesServiceImpl implements pacientesService {
    private final pacienteRepository pacienteRepository;

    @Override
    public List<Pacientes> getPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public List<Pacientes> postPacientes(Pacientes pacientes) {
        return (List<Pacientes>) pacienteRepository.save(pacientes);
    }
}
