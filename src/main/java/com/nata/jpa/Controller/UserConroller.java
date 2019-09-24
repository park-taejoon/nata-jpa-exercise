package com.nata.jpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nata.jpa.model.User;
import com.nata.jpa.repositorie.UserRepository;

@RestController
@RequestMapping("/user")
public class UserConroller {
	 @Autowired
	 private UserRepository userRepository;
	 @GetMapping("/all")
	 public List<User> findByUserAll() {
	       return userRepository.findAll();
	 }
	 //https://sanghaklee.tistory.com/57
	 @GetMapping("/id/{id}")
     public User getProductById(@PathVariable("id") long id) {
        return userRepository.findById(id).get();
     }
	 @GetMapping("/nick/{nick}")
     public User getProductById(@PathVariable("nick") String nick) {
        return userRepository.findByNick(nick).get();
     }
}
