# 🌟 Anime Naruto - Projeto em Java com Spring Boot 🌟

Este projeto é uma aplicação em Java utilizando Spring Boot, que simula interações entre personagens do anime Naruto. O objetivo é praticar conceitos de Programação Orientada a Objetos (POO) e a utilização do framework Spring Boot.

## 🚀 Funcionalidades

- 🥷 Representação de personagens do anime Naruto com atributos como nome, idade, aldeia, jutsus e chakra.
- ⚔️ Implementação de herança e interfaces para diferentes tipos de ninjas (Taijutsu, Ninjutsu, Genjutsu).
- ✨ Métodos para adicionar jutsus, aumentar chakra e exibir informações dos personagens.
- 🌐 API REST para interagir com os personagens.

## 🛠️ Tecnologias Utilizadas

- **Java**: Linguagem de programação.
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **JUnit**: Framework para testes automatizados.
- **Maven**: Gerenciador de dependências e construção do projeto.

## 📂 Estrutura do Projeto
src
└── main
    ├── java
    │   └── com
    │       └── seu_pacote
    │           ├── AnimeNarutoApplication.java
    │           ├── model
    │           │   ├── Personagem.java
    │           │   ├── Ninja.java
    │           │   ├── NinjaDeTaijutsu.java
    │           │   ├── NinjaDeNinjutsu.java
    │           │   └── NinjaDeGenjutsu.java
    │           └── controller
    │               └── NarutoController.java
    └── resources
        └── application.properties



## 📋 Pré-requisitos

Antes de executar o projeto, você precisa ter instalado:

- [Java JDK 11 ou superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/download.cgi) (opcional, se você não estiver usando uma IDE que gerencia dependências)

## 🏁 Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu_usuario/seu_repositorio.git
   cd seu_repositorio

2. **Navegue até o diretório do projeto.**

3. Compile e execute a aplicação:

Se você estiver usando Maven, execute:
```bash
  ./mvnw spring-boot:run
```

Ou, se você estiver usando Gradle:
```bash
  ./gradlew bootRun
```

4. Acesse a API
 Abra um navegador ou uma ferramenta como Postman e acesse:
```bash
  http://localhost:8080/ninja
```

🧪 Testes
Para executar os testes automatizados, você pode usar o Maven ou a sua IDE:

Usando Maven:
```bash
./mvnw test
```
🤝 Contribuição
Contribuições são bem-vindas! Se você deseja contribuir, siga estas etapas:

1. Faça um fork do projeto.
2. Crie uma nova branch (git checkout -b feature/nova-funcionalidade).
3. Faça suas alterações e commit (git commit -m 'Adiciona nova funcionalidade').
4. Envie para o repositório remoto (git push origin feature/nova-funcionalidade).
5. Abra um Pull Request.


📬 Contato
Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato:

Seu Nome - seu_email@example.com
Seu LinkedIn




        
