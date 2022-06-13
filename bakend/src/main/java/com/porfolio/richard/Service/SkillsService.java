package com.porfolio.richard.Service;

import com.porfolio.richard.Entity.Skills;                                         import com.porfolio.richard.Repository.SkillsRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SkillsService {

        private final SkillsRepository skillsRepository;

        @Autowired
        public SkillsService(SkillsRepository skillsRepository){
        this.skillsRepository = skillsRepository;
        }

        public Skills addSkills(Skills skills){
                return skillsRepository.save(skills);
        }
        public List<Skills>buscarSkills(){
                return skillsRepository.findAll();
        }
        public Skills editarSkills(Skills skills){
                return skillsRepository.save(skills);
        }
        public void borrarSkills(Long id){
                skillsRepository.deleteById(id);
        }
}

