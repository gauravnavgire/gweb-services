package com.rubix.webservices;

import static springfox.documentation.schema.AlternateTypeRules.newRule;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Dipesh Swagger Configuration for Restful API Documentation.
 *
 * 
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket fieldTestAPI() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.rubix.webservices"))
				.paths(PathSelectors.ant("/api/v1/.*")).build()
				.apiInfo(new ApiInfo("My REST API", "Some custom description of API.", "API TOS", "Terms of service",
						"myeaddress@company.com", "License of API", "API license URL"))
				.pathMapping("/api/v1/.*").forCodeGeneration(true).directModelSubstitute(LocalDate.class, String.class)
				.genericModelSubstitutes(ResponseEntity.class)
				.alternateTypeRules(newRule(
						typeResolver.resolve(DeferredResult.class,
								typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
						typeResolver.resolve(WildcardType.class)))
				.useDefaultResponseMessages(false).enableUrlTemplating(false);
	}

	@Autowired
	private TypeResolver typeResolver;

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("My REST API", "Some custom description of API.", "API TOS", "Terms of service",
				"myeaddress@company.com", "License of API", "API license URL");
		return apiInfo;
	}
}
