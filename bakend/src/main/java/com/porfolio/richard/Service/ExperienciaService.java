package com.porfolio.richard.Service;

import com.porfolio.richard.Entity.Experiencia;                     
import com.porfolio.richard.Repository.ExperienciaRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ExperienciaService {

        private final ExperienciaRepository experienciaRepository;

        @Autowired
        public ExperienciaService(ExperienciaRepository experienciaRepository){
        this.experienciaRepository = experienciaRepository;
        }

        public Experiencia addExperiencia(Experiencia experiencia){
                return experienciaRepository.save(experiencia);
        }
        public List<Experiencia>buscarExperiencia(){
                return experienciaRepository.findAll();
        }
        public Experiencia editarExperiencia(Experiencia experiencia){
                return experienciaRepository.save(experiencia);
        }
        public void borrarExperiencia(Long id){
                experienciaRepository.deleteById(id);
        }
}
