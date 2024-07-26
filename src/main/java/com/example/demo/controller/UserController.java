package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.User;
import com.example.demo.utils.JsonData;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("user")
@CrossOrigin
@Tag(name = "UserController", description = "用户接口")
public class UserController {

	/**
	 * 用户注册
	 *
	 * @param registerUser
	 * @return
	 */
	@Operation(description = "用户注册")
	@PostMapping("register")
	public JsonData register(@RequestBody User registerUser) {
		return JsonData.buildSuccess();
	}

}
