package com.nata.jpa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nata.jpa.model.User;
import com.nata.jpa.repositorie.UserRepository;
import com.nata.jpa.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	private final UserRepository repository;
	@Autowired
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}
	@Override
	public List<User> findAll() {
		return repository.findAll();
	}
	@Override
	public Optional<User> findByCd(Long id){
		return repository.findByCd(id);
	}
	@Override
	public Optional<User> findById(String id) {
		return repository.findById(id);
	}

}
