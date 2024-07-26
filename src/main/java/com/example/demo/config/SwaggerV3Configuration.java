package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiOperation;
import lombok.Data;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Component
@Data
@ConfigurationProperties("swagger")
@EnableOpenApi // 开启open api规范
public class SwaggerV3Configuration {

	// 是否开启swagger（这里用一个boolean变量来控制），生产环境需要关闭
	private Boolean enable;

	// 项目应用的名字
	private String applicationName;

	// 项目版本号
	private String applicationVersion;

	// 项目描述信息
	private String applicationDescription;

	/**
	 * 通过Docket来把配置文件中的配置信息， 加载到当前的swagger配置类中， 被spring扫描，并被spring纳入到IoC容器中进行管理
	 * Bean注解，作用是返回当前的Docket类
	 */
	@Bean
	public Docket docket() {
		// OAS_30就是swagger v3.0
		return new Docket(DocumentationType.OAS_30)
				// 固定写法
				.pathMapping("/")

				// 是否开启swager, false为关闭
				.enable(enable)

				// 配置api文档元信息
				.apiInfo(apiInfo())

				// 选择哪些接口作为swagger的发布
				.select()

				// apis() 控制哪些接口需要暴露给swagger
				// RequestHandlerSelectors.any() 暴露所有
				// RequestHandlerSelectors.basePackage("com.example.demo.*") 暴露指定包位置
				// withMethodAnnotation(ApiOperation.class) 暴露标记有这个注解ApiOperation
				.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))

				// 固定写法
				.paths(PathSelectors.any())

				// 创建Docket对象（建造者模式）
				.build();
	}

	// 构建api文档元信息对象
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				// api文档标题
				.title(applicationName)

				// api文档描述
				.description(applicationDescription)

				// api文档版本号
				.version(applicationVersion)

				// 作者联系信息
				.contact(new Contact("daniel shao", "http://xxx.xxx.com", "123456@gmail.com")).build();
	}

}
