package fr.isika.al12.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isika.al12.dao.UserDao;
import fr.isika.al12.model.User;

@Service
public class UserService {
		
		@Autowired
		private UserDao userDao;
		
		
		public Optional<User> getUserByMail(String mail) {
			
			return userDao.findByEmail(mail);
			
		}
		
	
	}

	

