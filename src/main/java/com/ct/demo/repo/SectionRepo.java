package com.ct.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ct.demo.entity.Section;

@Repository
public interface SectionRepo extends JpaRepository <Section,Long> {

	

}
