package com.porfolio.richard.Service;

import com.porfolio.richard.Entity.Educacion;
import com.porfolio.richard.Repository.EducacionRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class EducacionService {
	
	private final EducacionRepository educacionRepository;

	@Autowired
	public EducacionService(EducacionRepository educacionRepository){
	this.educacionRepository = educacionRepository;
	}

	public Educacion addEducacion(Educacion educacion){
		return educacionRepository.save(educacion);
	}
	public List<Educacion>buscarEducaciones(){
		return educacionRepository.findAll();
	}
	public Educacion editarEducacion(Educacion educacion){
		return educacionRepository.save(educacion);
	}
	public void borrarEducacion(Long id){
		educacionRepository.deleteById(id);
	}

}
