package com.ct.demo.service;

import org.apache.catalina.User;

public interface UserService {

	User save(User user);

	User getById(Long id);

	User update(User user);

	void deletebyid(Long id);

}
