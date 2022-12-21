package com.example.testswagger.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringFoxConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Test Swagger API")
                        .description("Sample application for testing swagger")
                        .version("v1")
                        .license(new License().name("MyCompany").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("Additional Info links")
                        .url("https://springshop.wiki.github.org/docs"));
    }
}
