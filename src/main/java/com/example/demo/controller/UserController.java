package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.User;
import com.example.demo.request.AddUserRequest;
import com.example.demo.utils.JsonData;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("user")
@Api(tags = "用户模块", value = "用户controller")
public class UserController {

	@ApiOperation("用户注册")
	@GetMapping("/reg")
	public JsonData register(User registerUser) {
		return JsonData.buildSuccess();
	}

	@ApiOperation("用户列表")
	@GetMapping("/list")
	public JsonData list() {
		return JsonData.buildSuccess();
	}

	@ApiOperation("用户查询")
	@GetMapping("/query")
	public JsonData query(@ApiParam(name = "userName", value = "用户名称", example = "Java") String userName) {
		return JsonData.buildSuccess();
	}

	@ApiOperation("用户添加")
	@PostMapping("/add")
	public JsonData addUser(@RequestBody AddUserRequest addUserRequest) {
		return JsonData.buildSuccess();
	}

	/**
	 * RESTFul风格的API
	 * 
	 * @return
	 */
	@ApiOperation("用户更新")
	@PatchMapping("/update/{id}")
	public JsonData updateById(@ApiParam(name = "id", value = "用户id", example = "1") @PathVariable int id) {
		return JsonData.buildSuccess();
	}

	/**
	 * RESTFul风格的API
	 * 
	 * @return
	 */
	@ApiIgnore
	@ApiOperation("用户删除")
	@DeleteMapping("/remove/{id}")
	public JsonData removeById(@ApiParam(name = "id", value = "用户id", example = "1") @PathVariable int id) {
		return JsonData.buildSuccess();
	}

}
