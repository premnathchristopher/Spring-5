package com.mindfire.carreview.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.mindfire.carreview.DTO.UserRegistrationDto;
import com.mindfire.carreview.DTO.UserSigninDto;
import com.mindfire.carreview.domain.UserDetails;
import com.mindfire.carreview.repository.UserRepository;

@Service
public class UserDetailsService {

	@Autowired
	public UserRepository userRepository;

	public String createUserDetails(UserRegistrationDto dto, Model model) {
		List<UserDetails> userExists = userRepository.findByEmail(dto.getEmail());
		if (userExists.isEmpty()) {

			UserDetails newUser = new UserDetails();

			newUser.setFirstname(dto.getFirstname());
			newUser.setLastname(dto.getLastname());
			newUser.setEmail(dto.getEmail());
			newUser.setUsername(dto.getUsername());
			newUser.setPassword(new BCryptPasswordEncoder().encode(dto.getPassword()));
			newUser.setPrivilege("user");

			UserDetails obj = userRepository.save(newUser);
			System.out.println(obj);
			if (obj.equals(null)) {
				return "signup";
			} else {
				return "result";
			}
		}

		else {
			model.addAttribute("userExists", "Email already Registered!!");
			return "signup";
		}

	}
	
	public String UserLogin(UserSigninDto dto, Model model,HttpSession session) {

		List<UserDetails> checkExist = userRepository.findByUsername(dto.getUsername());

		String password = checkExist.get(0).getPassword();
		if (checkExist != null && new BCryptPasswordEncoder().matches(dto.getPassword(), password)) {
			if(checkExist.get(0).getPrivilege().equals("admin"))
			{
				session.setAttribute("role", "admin");
				return "redirect:admin";
			} else {
				session.setAttribute("role", "user");
				return "redirect:home";
			}
		} else {
			model.addAttribute("status", "Username or Password Error!!!");
			return "login";
		}
	}
	
	
}
