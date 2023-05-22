package com.aws.backend.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StartedResources {

    @RequestMapping("/")
    public String started() {
        return "✅✅ Started Resources de Produtos iniciada com sucesso! ✅✅ "
                + "\r\n"
                + "link para acessar o SWAGGER: http://localhost:8080/swagger-ui.html"
                + "\r\n"
                + "Para acesso do código fonte deste projeto acesse o GitHub:  https://github.com/DaniloADamasceno/Angular-com-Spring-Boot \n";

    }
}
