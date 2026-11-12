# 4Clutch API

Backend for an academic Counter-Strike 2 skin e-commerce project. Exposes products, categories, models, users and orders to the [web client](https://github.com/chruscinskiDiego/4Clutch-Client).

## Features

- Product creation and queries, including product attributes.
- User management and JWT authentication.
- Orders and their associated products.
- Validation, error handling and separation into controllers, services and repositories.

## Technologies

Java 17, Spring Boot, Spring Web, Spring Security, Spring Data JPA, Bean Validation, PostgreSQL and Lombok.

## Run locally

1. Install JDK 17 and make PostgreSQL available.
2. Create a development database and adjust api/src/main/resources/application.yml. The current setup uses PostgreSQL; the H2 dependency is commented out in pom.xml.
3. Run from the repository root:

```bash
cd api
sh mvnw spring-boot:run
```

The configured port is 8025. Use your own development credentials rather than reusing example values in public environments.

## Structure

- `controller/`: HTTP resources.
- `service/`: rules and operations.
- `repository/` and `model/`: persistence and entities.
- `security/`: authentication and authorization.
- `validation/`: custom validators.

## Tests

```bash
cd api
sh mvnw test
```

Tests and startup require the database configuration. Validate them in your own environment.

## Authors

- Diego Chruscinski de Souza
- Gustavo Moretto Dalla Costa

## Context

Academic project without real payment processing or a declared commercial operation.
