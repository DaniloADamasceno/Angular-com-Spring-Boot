# CRUD com Anular e Spring Boot

</hr>
</br>
</br>

![GitHub repo size](https://img.shields.io/github/repo-size/DaniloADamasceno/Angular-com-Spring-Boot?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/DaniloADamasceno/Angular-com-Spring-Boot?style=for-the-badge)

[![wakatime](https://wakatime.com/badge/user/e7f2e494-878d-4290-9a2b-cc473da48b8a/project/efbe327f-642a-4a1f-a7e6-e6bc9a23c180.svg)](https://wakatime.com/badge/user/e7f2e494-878d-4290-9a2b-cc473da48b8a/project/efbe327f-642a-4a1f-a7e6-e6bc9a23c180)

<div align="center">
        
## ⚠️⚠️ **Em CONTRUÇÃO**
        
</div>


<!-- Imagem da Tela inicial do Aplicativo -->
<div align="center">

![Imagem](https://raw.githubusercontent.com/DaniloADamasceno/Angular-com-Spring-Boot/Front-Angular/assets/Angular%20com%20Spring.png)
</div>
<hr>

</br>
</br>

## Descrição do Projeto

Este projeto é uma aplicação CRUD (Create, Read, Update, Delete) desenvolvida utilizando Angular para o front-end e Spring Boot para o back-end. A aplicação foi implementada na AWS (Amazon Web Services) para garantir escalabilidade e desempenho.

## Pré-requisitos

- Node.js instalado em sua máquina. Você pode baixá-lo aqui: *https://nodejs.org/en/*
- Angular CLI instalado. Para instalar, execute o seguinte comando no terminal: *npm install -g @angular/cli*
- Java instalado em sua máquina. Você pode baixá-lo aqui: *https://www.java.com/en/download/*
- IDE de sua escolha. Recomendamos o IntelliJ IDEA: *https://www.jetbrains.com/idea/download/*

</br>

## Criando o projeto Spring Boot

- Abra a sua IDEA e selecione "Criar novo projeto".
- Selecione "Spring Initializr" ( caso não tenha na sua IDEA utilize o site do Spring Initializr: *https://start.spring.io/*).
- Selecione as seguintes opções:

        - Tipo de projeto: Maven
        - Linguagem: Java
        - Versão do Spring Boot: 2.5.0
        - Nome do projeto: (o nome que desejar)
        - Nome do pacote: (o nome que desejar)
        - Empacotamento: Jar
        - Java: 8, 11, ou 17   ---> OBs: de preferencia pra estas versões do java pois são as versões LTS

- Clique em "Próximo".
- Na guia "Dependências", procure por "Spring Web" e selecione a caixa de seleção.
- Clique em "Próximo".
- Escolha o local onde deseja salvar o projeto e clique em "Concluir".

</br>

## Criando o back-end

- Abra o arquivo *src/main/java/com.example.demo/DemoApplication.java*.
- Adicione a anotação *@RestController* à classe.
- Adicione o seguinte método à classe:

```Java

@GetMapping("/hello")
public String hello() {
    return "Hello World!";
}
```

- Execute o aplicativo clicando com o botão direito do mouse no arquivo DemoApplication.java e selecionando "Executar".

<hr>

## Criando o projeto Angular

Abra o terminal e navegue até a pasta onde deseja criar o projeto Angular.
Execute o seguinte comando: ng new my-app
Quando solicitado, escolha o estilo de folha de estilo que desejar. Recomendamos CSS.
Depois que o projeto for criado, navegue até a pasta do projeto digitando cd my-app.
Inicie o servidor de desenvolvimento digitando ng serve.

</hr>

## Criando o front-end
- Abra o arquivo *src/app/app.component.html*.
- Adicione o seguinte código:

```css

<h1>{{title}}</h1>
<p>{{message}}</p>
```
- Abra o arquivo *src/app/app.component.ts*.
- Adicione o seguinte código:

```typescript
import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'My App';
  message = '';

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.http.get('/api/hello', { responseType: 'text' }).subscribe((data) => {
      this.message = data;
    });
  }
}
```
- Execute o servidor de desenvolvimento novamente digitando ng serve.
- Agora você deve ser capaz de visualizar "Hello World!" no navegador ao acessar **http://localhost:4200**.

## Stack utilizada

**Front-end:** ![Angular](https://img.shields.io/badge/Angular-DD0031?style=for-the-badge&logo=angular&logoColor=white "Badge Angular")

**Back-end:**  ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white "Badge Java")
![SpringBoot](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white "Badge Spring Boot")

**Plataforma de Nuvem:** ![AWS](https://img.shields.io/badge/Amazon_AWS-232F3E?style=for-the-badge&logo=amazon-aws&logoColor=white)

## Autores

- [@Danilo A. Damasceno](https://github.com/DaniloADamasceno/)

</br>
</br>
</br>

________________________________________________________________________________________________________________________________________________________________

## Atualizações de Projeto e suas Versões

*Atualização* 1.2.0 :
> Desenvolvimento do Front-End.
> FRONT-END em desenvolvimento.
> --> **PROJETO EM DESENVOLVIMENTO.**
</br>
