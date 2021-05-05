package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.UserDTO;
import com.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userservice;
	
	@RequestMapping(value = "/users")
	public String user(Model mm){
		return "index";
	}
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String userInputForm(UserDTO dto){
		userservice.save(dto);
		return "index";
	}
}
