# Projeto MyMovies

O Projeto MyMovies é uma aplicação backend feita em Kotlin utilizando o framework Spring. A aplicação utiliza um banco de dados PostgreSQL hospedado no servidor supabase.com.

Esse projeto foi feito com o objetivo de demonstrar em aula o deploy de uma aplicação (Kotlin + Spring + PostgreSQL) no servidor render.com

## Requisitos

Para o deploy será necessário:

- Criar um conta no render.com
- Especificar o seguinte arquivo Dockerfile na raiz do diretório do projeto:

```
# Build stage
FROM gradle:8.11.1 as build
COPY . /app
WORKDIR /app
RUN gradle build --no-daemon

# Package stage
FROM openjdk:21-jdk
COPY --from=build /app/build/libs/MyMovies-1.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
```
