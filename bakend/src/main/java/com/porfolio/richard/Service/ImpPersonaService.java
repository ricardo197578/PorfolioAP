package com.porfolio.richard.Service;

import com.porfolio.richard.Entity.Persona;
import com.porfolio.richard.Interface.IPersonaService;
import com.porfolio.richard.Repository.IPersonaRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@Service
public class ImpPersonaService implements IPersonaService {
	/*a Autowired(inyecta dependencias dentro de otra) le digo que me cree un objeto ipersonaRepository de tipo IPersonaRepository*/

	@Autowired IPersonaRepository ipersonaRepository;

	/*METODOS*/

	@Override
	public List<Persona> getPersona(){
		List<Persona> persona = ipersonaRepository.findAll();
		return persona;
	}
	@Override
	public void savePersona(Persona persona){
		ipersonaRepository.save(persona);
	}
	@Override
	public void deletePersona(Long id){
	ipersonaRepository.deleteById(id);
	}

	@Override
	public Persona findPersona(Long id){
		Persona persona = ipersonaRepository.findById(id).orElse(null);
	return persona;
	}

}
