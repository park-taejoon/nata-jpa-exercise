package com.nata.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nata.jpa.model.User;
import com.nata.jpa.service.UserService;

@RestController
@RequestMapping("/user")
public class UserConroller {
	 @Autowired
	 private UserService userService;
	 @GetMapping("/all")
	 public List<User> findByUserAll() {
	       return userService.findAll();
	 }
	 @GetMapping("/group")
	 public List<User> findByGroup() {
	       return userService.findAll();
	 }
	 @GetMapping("/cd/{id}")
     public User getProductByCd(@PathVariable("id") long id) {
        return userService.findByCd(id).get();
     }
	 @GetMapping("/id/{id}")
     public User getProductById(@PathVariable("id") String id) {
        return userService.findById(id).get();
     }
}
