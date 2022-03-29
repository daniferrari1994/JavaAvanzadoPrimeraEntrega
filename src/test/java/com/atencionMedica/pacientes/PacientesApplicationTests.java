package com.atencionMedica.pacientes;

import com.atencionMedica.pacientes.entity.Pacientes;
import com.atencionMedica.pacientes.repository.pacienteRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
class PacientesApplicationTests {

	@Autowired
	private pacienteRepository pacienteRepository;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void crearPaciente() {
		Pacientes paciente = new Pacientes();
		paciente.setName(encoder.encode("fede"));
		paciente.setId(1);
		Pacientes retorno = pacienteRepository.save(paciente);

		assertTrue(retorno.getName().equalsIgnoreCase(paciente.getName()));
	}

}
