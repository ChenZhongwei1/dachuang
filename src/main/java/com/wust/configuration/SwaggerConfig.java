package com.wust.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//接口网页http://localhost:8080/swagger-ui.html#/
@Configuration
@EnableSwagger2
@EnableWebMvc
//@ComponentScan("com.wust.controller")

public class SwaggerConfig {

    //接口文档访问链接http://localhost:8080/swagger-ui.html
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).forCodeGeneration(true).select().apis(RequestHandlerSelectors.any())
                //过滤生成链接
                .paths(PathSelectors.regex("/api/.*")).build().apiInfo(apiInfo());
    }

    //api接口作者相关信息
    private ApiInfo apiInfo() {
        Contact contact = new Contact("Helen", "http://www.google.cn", "kidandkite@163.com");
        ApiInfo apiInfo = new ApiInfoBuilder().license("Apache License Version 2.0").title("大创").description("接口文档").contact(contact).version("1.0").build();
        return apiInfo;
    }
}
