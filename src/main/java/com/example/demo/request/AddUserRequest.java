package com.example.demo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "添加用户的请求数据模型")
@Data
public class AddUserRequest {

	@ApiModelProperty(value = "主键")
	private int id;

	@ApiModelProperty(value = "用户名", required = true, example = "aaa")
	private String username;

	@ApiModelProperty(value = "登录密码", required = true, example = "123456")
	private String password;

	@ApiModelProperty(value = "用户描述", required = false, example = "input your description details here...")
	private String description;
}
