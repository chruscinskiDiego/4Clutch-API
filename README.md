# 4Clutch API

Backend de um e-commerce acadêmico de skins de Counter-Strike 2. Expõe recursos de produtos, categorias, modelos, usuários e pedidos para o [cliente web](https://github.com/chruscinskiDiego/4Clutch-Client).

## Funcionalidades

- Cadastro e consulta de produtos e seus atributos.
- Gerenciamento de usuários e autenticação com JWT.
- Pedidos e associação dos produtos aos pedidos.
- Validações, tratamento de erros e separação entre controllers, services e repositories.

## Tecnologias

Java 17, Spring Boot, Spring Web, Spring Security, Spring Data JPA, Bean Validation, PostgreSQL e Lombok.

## Executar localmente

1. Instale JDK 17 e disponibilize um PostgreSQL.
2. Crie o banco de desenvolvimento e ajuste a conexão em api/src/main/resources/application.yml. A configuração atual usa PostgreSQL; a dependência H2 está comentada no pom.xml.
3. Execute na raiz:

```bash
cd api
sh mvnw spring-boot:run
```

A porta configurada é 8025. Utilize credenciais próprias de desenvolvimento, sem reaproveitar valores de exemplo em ambientes públicos.

## Organização

- `controller/`: recursos HTTP.
- `service/`: regras e operações.
- `repository/` e `model/`: persistência e entidades.
- `security/`: autenticação e autorização.
- `validation/`: validadores específicos.

## Testes

```bash
cd api
sh mvnw test
```

Os testes e a inicialização dependem da configuração do banco e não foram executados nesta revisão.

## Autores

- Diego Chruscinski de Souza
- Gustavo Moretto Dalla Costa

## Contexto

Projeto acadêmico, sem integração de pagamentos reais ou operação comercial declarada.
