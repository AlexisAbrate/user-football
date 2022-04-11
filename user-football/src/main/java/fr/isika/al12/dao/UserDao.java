package fr.isika.al12.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.isika.al12.model.User;

public interface UserDao extends JpaRepository<User,Long>{
	
	Optional<User> findByEmail(String username);

}
