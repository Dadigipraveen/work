package com.ct.demo.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ct.demo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserService service;

	@Autowired
	UserRepo repo;

	@Override
	public User save(User user) {

		return service.save(user);
	}

	@Override
	public User getById(Long id) {

		return service.getById(id);
	}

	@Override
	public User update(User user) {

		return service.update(user);
	}

	@Override
	public void deletebyid(Long id) {

		service.deletebyid(id);
	}

}
