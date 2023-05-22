package br.com.apiProduto.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI customOpenAPI() { // link para acessar o SWAGGER: http://localhost:8080/swagger-ui.html
        return new OpenAPI()
                .info(
                        new io.swagger.v3.oas.models.info.Info()
                                .title("API REST de Produtos")
                                .version("1.0.0")
                                .description("API REST de Produtos na linguagem Java com Spring Boot e Angular 11 na Cloud AWS")
                );
    }
}
