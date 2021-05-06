package com.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByFirstname(String firstname);
	List<User> findByLastname(String lastname);
	Optional<User> findById(Long id);
}
