package com.nata.jpa.service;

import java.util.List;
import java.util.Optional;

import com.nata.jpa.model.User;

public interface UserService {
	List<User> findAll();
	Optional<User> findByCd(Long cd);
	Optional<User> findById(String id);
}
