package com.aws.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackEndProdutoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BackEndProdutoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("✅ ✅");
        System.out.println("✅✅ API REST de Produtos iniciada com sucesso! ✅✅ ");
        System.out.println("Desenvolvido por: Danilo A. Damasceno");
        System.out.println("LinkedIn: https://www.linkedin.com/in/daniloadamasceno/");
        System.out.println("GitHub: https://github.com/DaniloADamasceno");
        System.out.println("✅ ✅");
    }
}
