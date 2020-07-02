package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.UserDTO;

/**
 * User controller
 */
@RestController
public class UserController {
	
	//get method
	@GetMapping("/user")
	public List<UserDTO> allUser() {
		UserDTO user1 = new UserDTO(5436546,"John Smith","+1-416-123-1234");
		UserDTO user2 = new UserDTO(54365477,"Wils","+1-416-345-3456");
		List<UserDTO> users = new ArrayList<UserDTO>();
		users.add(user1);
		users.add(user2);
		return users;
	}
	
	//get user method
//	@GetMapping("/user/{name}")
//	public UserDTO getuserByName(@PathVariable String name) {
//		return new UserDTO(54365477, name, "+1-416-345-3456");
//	}
	
	//post method
	@PostMapping("/user/add")
	public UserDTO addUser(@RequestBody UserDTO user) {
		return user;
	}
	
	//delete method
	@DeleteMapping("/user/delete/{id}")
	public String deleteUser(@PathVariable String id) {
		HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.APPLICATION_JSON);
		
		if(StringUtils.isNotEmpty(id))
			return "Deleted User : " + id;
		else 
			return null;
	}
	
}
