package com.ct.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.ct.demo.entity.User;
import com.ct.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;

	@Autowired
	User user;

	@PostMapping("/saveuser")
	public String saveSection(@ModelAttribute("User") org.apache.catalina.User user) {
		service.save(user);

		return "redirect:/saveuser";
	}

	@PutMapping("/updateuser/{id}")
	public String updateUser(@PathVariable Long id, @ModelAttribute("User") User user) {

		user.setId(user.getId());
		user.setFirstname(user.getFirstname());
		user.setLastname(user.getLastname());
		user.setEmail(user.getEmail());
		user.setPassword(user.getPassword());

		return "redirect:/UserView";
	}

	@GetMapping("/user/{id}")
	public String getuser(User user) {
		user.getId();

		return "redirect:/userid";
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable Long id) {
		service.deletebyid(id);
		return "redirect:/UserView";
	}
}
