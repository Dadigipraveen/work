package com.ct.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ct.demo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
