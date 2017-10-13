package br.com.delivery.api.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;

public class ApplicationSwaggerConfig {

    @Bean
    public springfox.documentation.spring.web.plugins.Docket docket() {
        Docket docket = new Docket(springfox.documentation.spi.DocumentationType.SWAGGER_2);
        return docket.apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Delivery REST API",
                "Exemplo de descrição da API.",
                "Versão API 1.0",
                "Termos de uso",
                "contato@e-mail.com",
                "API License",
                "API License URL"
        );
        return apiInfo;


    }
}
