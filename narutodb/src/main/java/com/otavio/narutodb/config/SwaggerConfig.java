package com.otavio.narutodb.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("NarutoDB API")
                        .version("1.0")
                        .description("API para gerenciar informações do Naruto"));
    }
}



//Pra Rodar http://localhost:8080/swagger-ui.html
