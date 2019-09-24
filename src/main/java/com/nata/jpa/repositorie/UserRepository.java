package com.nata.jpa.repositorie;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nata.jpa.model.User;

//https://spring.io/guides/gs/accessing-data-jpa/
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByNick(String nick);
}
