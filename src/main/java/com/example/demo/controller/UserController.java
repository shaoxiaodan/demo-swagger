package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.User;
import com.example.demo.utils.JsonData;

@RestController
@RequestMapping("user")
public class UserController {

	@GetMapping("register")
	public JsonData register(User registerUser) {
		return JsonData.buildSuccess();
	}

}
