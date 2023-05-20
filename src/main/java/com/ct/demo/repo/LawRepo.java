package com.ct.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ct.demo.entity.Law;

@Repository
public interface LawRepo extends JpaRepository<Law, Long> {

}
