package com.example.demo.dao;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

	private Integer id;
	private String username;
	private String password;
	private String description;
	private Date createTime;
	private Date updateTime;

}
