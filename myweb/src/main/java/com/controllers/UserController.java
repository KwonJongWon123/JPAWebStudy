package com.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.User;
import com.service.UserDTO;
import com.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userservice;
	
	@RequestMapping(value = "/users")
	public String user(){
		return "index";
	}
	//입력
	@RequestMapping(value = "/input")
	public String userInputForm(Model mm){
		return "input";
	}
	@RequestMapping(value = "/input", method = RequestMethod.POST)
	public String userInputForm(UserDTO dto){
		userservice.save(dto);
		return "index";
	}
	
	//조회
	@RequestMapping(value = "/users/all")
	public String userAllForm(UserDTO dto,HttpServletRequest req){
		req.setAttribute("list", userservice.list());
		
		return "list";
	}
	@RequestMapping(value = "/users/one")
	public String userOne(){
		return "liston";
	}
	@RequestMapping(value = "/users/one", method = RequestMethod.POST)
	public String userOneForm(UserDTO dto,HttpServletRequest req){
		req.setAttribute("list", userservice.listone(dto));
		return "list";
	}
	
	//삭제
	@RequestMapping(value = "/users/delete")
	public String userDelete(HttpServletRequest req){
		req.setAttribute("list", userservice.list());
		return "delete";
	}
	@RequestMapping(value = "/users/delete", method = RequestMethod.POST)
	public String userDeleteForm(Long choice,HttpServletRequest req){
		userservice.delete(choice);
		return "index";
	}
	
	//수정
	@RequestMapping(value = "/users/update")
	public String userUpdate(HttpServletRequest req){
		req.setAttribute("list", userservice.list());
		return "updatelist";
	}
	
	@RequestMapping(value = "/users/updateReg", method = RequestMethod.POST)
	public String userUpdateForm(User user,HttpServletRequest req){
		userservice.update(user);
		return "index";
	}
	
}
