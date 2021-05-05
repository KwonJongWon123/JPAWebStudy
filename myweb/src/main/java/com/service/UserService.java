package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.entity.User;
import com.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository userrepository;
	
	public User save(UserDTO dto) {
		User user = new User();
		user.setFirstname(dto.getFirstname());
		user.setLastname(dto.getFirstname());
		
		return userrepository.save(user);
	}
	
}
