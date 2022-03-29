package com.atencionMedica.pacientes.controller;

import com.atencionMedica.pacientes.entity.Pacientes;
import com.atencionMedica.pacientes.repository.pacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiPacientes")
public class pacientesController {
    @Autowired
    private pacienteRepository pacienteRepository;

    @GetMapping("/pacientes")
    List<Pacientes> getPacientes(){ return (List<Pacientes>) pacienteRepository.findAll();}

    @PostMapping("/pacientes/{id}")
    Pacientes postPaciente(@RequestBody Pacientes paciente){ return pacienteRepository.save(paciente);}
}
