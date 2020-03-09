package com.example.hellospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yoogo on 2020-03-10
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket adminDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("admin")
                .apiInfo(adminApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.hellospring.controller"))
                .paths(PathSelectors.any())
                .build()
                .securitySchemes(securitySchemes());
//                to jwt auth
//                .securityContexts(securityContexts());
    }

    private List<ApiKey> securitySchemes() {
        //设置请求头信息
        List<ApiKey> result = new ArrayList<>();
        ApiKey apiKey = new ApiKey("X-Admin-Token", "X-Admin-Token", "header");
        result.add(apiKey);
        return result;
    }

    private ApiInfo adminApiInfo() {
        return new ApiInfoBuilder()
                .title("API")
                .description("Demo API")
                .termsOfServiceUrl("https://github.com/YoogoC")
                .version("1.0")
                .build();
    }

    private List<SecurityContext> securityContexts() {
        List<SecurityContext> contexts = new ArrayList<>(1);
        SecurityContext securityContext = SecurityContext.builder()
                .securityReferences(defaultAuth())
                .forPaths(PathSelectors.regex("^((?!login).)*$"))
                .build();
        contexts.add(securityContext);
        return contexts;
    }

    private List<SecurityReference> defaultAuth() {
        List<SecurityReference> result = new ArrayList<>();
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        result.add(new SecurityReference("X-Admin-Token", authorizationScopes));
        return result;
    }
}
