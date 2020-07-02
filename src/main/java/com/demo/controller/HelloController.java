package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.dto.UserDTO;

/**
 * Hello controller
 */
@Controller
public class HelloController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

	@GetMapping("/list")
	public String list() {
		return "list";
	}

}
