package com.example.demo.dao;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

	private Integer id;
	private String username;
	private String password;
	private String description;
	private Date createTime;
	private Date updateTime;

}
