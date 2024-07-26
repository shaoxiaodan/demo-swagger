package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.User;
import com.example.demo.utils.JsonData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("user")
@Api(tags = "用户模块", value = "用户controller")
public class UserController {

	@ApiOperation("用户注册")
	@GetMapping("register")
	public JsonData register(User registerUser) {
		return JsonData.buildSuccess();
	}

	@ApiOperation("用户列表")
	@GetMapping("list")
	public JsonData list() {
		return JsonData.buildSuccess();
	}

	@ApiOperation("用户查询")
	@GetMapping("query")
	public JsonData query(@ApiParam(name = "userName", value = "用户名称", example = "Java") String userName) {
		return JsonData.buildSuccess();
	}
}
