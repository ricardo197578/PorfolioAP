package com.porfolio.richard.Repository;

import com.porfolio.richard.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills,Long> {

}
