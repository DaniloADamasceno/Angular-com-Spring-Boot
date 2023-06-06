package com.aws.backend.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StartedResources {

    @RequestMapping("/")
    public String started() {
        return "<h1>✅✅ Started Resources de Produtos iniciada com sucesso! ✅✅ </h1>" +
                "<br>"
                + "<br>"
                + "<h2>link para acessar o SWAGGER: <i> <a href=\"http://localhost:8080/swagger-ui.html\">Swager</a></i> </h2>"
                + "<h2>Para acesso do código fonte deste projeto acesse o GitHub: <i> <a href=\"https://github.com/DaniloADamasceno/Angular-com-Spring-Boot\">GitHub Danilo A. Damasceno</a> </i></h2>";



    }
}
