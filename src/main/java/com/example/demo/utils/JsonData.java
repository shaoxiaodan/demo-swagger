package com.example.demo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonData {

	// 状态码：0=成功，1=处理中，-1=失败
	private Integer code;

	// 数据
	private Object data;

	// 描述
	private String msg;

	// 成功，传入数据
	public static JsonData buildSuccess() {
		return new JsonData(0, null, null);
	}

	// 成功，传入数据
	public static JsonData buildSuccess(Object data) {
		return new JsonData(0, data, null);
	}

	// 失败，传入描述
	public static JsonData buildError(String msg) {
		return new JsonData(-1, null, msg);
	}

	// 失败，传入状态码和描述
	public static JsonData buildError(Integer code, String msg) {
		return new JsonData(code, null, msg);
	}
}
