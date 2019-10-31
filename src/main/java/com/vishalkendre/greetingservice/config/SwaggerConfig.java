package com.vishalkendre.greetingservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Enables swagger configuration for the documentation of REST services in the
 * application
 * 
 * @author vkendre
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * 
	 * @return {@link Docket} bean with customizations to document application REST
	 *         services
	 */
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.vishalkendre.greetingservice.controller"))
				.paths(PathSelectors.regex("/.*")).build().apiInfo(apiInfo());
	}

	/**
	 * 
	 * @return {@link ApiInfo} object containing meta information related to the
	 *         implemented service
	 */
	private ApiInfo apiInfo() {
		ApiInfoBuilder builder = new ApiInfoBuilder();
		builder.title("Greeting Service");
		builder.version("1.0");
		builder.description("A simple rest service to greet visitors");
		return builder.build();
	}
}