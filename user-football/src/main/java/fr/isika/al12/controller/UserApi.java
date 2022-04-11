package fr.isika.al12.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.isika.al12.model.User;
import fr.isika.al12.service.UserService;

@RestController
public class UserApi {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String hello(@RequestParam("mail") String mail) {
		Optional<User> userO = userService.getUserByMail(mail);
		User user = userO.get();
		if(user!=null) {
			return "Hello" + user.getUsername() + "you exist in database";
		}
		
		else {
			return "You are not in our database";
		}
	}
}
