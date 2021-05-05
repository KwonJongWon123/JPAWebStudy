package com.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

	public List<User> list() {
		return userrepository.findAll();
	}
	public List<User> listone(UserDTO dto) {
		List<User> ar = (List<User>) userrepository.findByFirstname(dto.getFirstname());
		ar.addAll(userrepository.findByLastname(dto.getFirstname()));
		HashSet<User> buf = new HashSet<>(ar);
		return new ArrayList<>(buf);
	}
	
	public void delete(Long id) {
		userrepository.deleteById(id);
	}
	
}
