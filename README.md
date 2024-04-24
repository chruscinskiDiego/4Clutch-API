# 4Clutch-API

## Membros
Diego Chruscinski de Souza  
Gustavo Moretto Dalla Costa

## Tecnologias Utilizadas
- Spring WEB
- JPA
- Validation
- H2
- Spring Security
- DevTools
- Lombok

## Ideia do Projeto
O 4Clutch-API é a parte backend do nosso projeto de E-commerce chamado 4Clutch, que se concentra na venda de skins para o popular jogo Counter-Strike 2 (CS2). 

Nossa API fornece funcionalidades essenciais para o funcionamento do E-commerce, incluindo operações CRUD (Create, Read, Update, Delete) para gerenciar produtos, usuários, pedidos e autenticação de usuários.


## Documentação

**Introdução**

Bem-vindo à documentação da nossa aplicação! Esta documentação fornece uma visão geral dos principais componentes e conceitos da nossa aplicação, ajudando você a entender sua estrutura e funcionamento.

**Estrutura da Aplicação**

Nossa aplicação segue uma arquitetura modular, dividida em pacotes distintos que desempenham funções específicas. Aqui está uma visão geral dos principais pacotes:

**Pacote de Segurança:** Contém classes responsáveis por proteger a aplicação e seus recursos, incluindo configurações de segurança, filtros de autenticação e autorização, constantes de segurança e serviços relacionados à autenticação e autorização de usuários.
**Controller:** Este pacote contém classes responsáveis por receber requisições HTTP dos clientes. As classes dentro deste pacote têm métodos que correspondem a diferentes endpoints da API e definem o comportamento da API para cada tipo de requisição.
**Service:** O pacote Service encapsula a lógica de negócios da aplicação. Ele fornece uma camada intermediária entre os controllers e os repositórios, isolando a lógica de negócios da camada de acesso a dados.
**Repository:** Este pacote é responsável pelo acesso e manipulação de dados no banco de dados. Ele fornece uma abstração sobre a camada de persistência de dados e permite que as outras camadas da aplicação trabalhem com objetos de domínio em vez de consultas SQL diretas.

**Componentes de Segurança**
O pacote de segurança desempenha um papel crucial na nossa aplicação, garantindo que apenas usuários autorizados possam acessar os recursos e protegendo contra ameaças de segurança comuns. Aqui estão os principais componentes desse pacote:

WebSecurity: Classe responsável por configurar as políticas de segurança da aplicação, como autenticação, autorização, manipulação de exceções e gerenciamento de sessões.
SecurityConstants: Classe que define constantes usadas no sistema de segurança, como segredo usado para gerar tokens JWT e tempo de expiração do token.
JWTAuthorizationFilter e JWTAuthenticationFilter: Filtros que interceptam requisições HTTP para realizar autenticação e autorização usando tokens JWT.
EntryPointUnauthorizedHandler: Manipulador de ponto de entrada não autorizado que envia uma resposta HTTP com status 401 quando ocorre um erro de autenticação.


## Como Usar

Para utilizar nossa aplicação, siga estas etapas:

Clone o Repositório: Clone o repositório da aplicação para sua máquina local.
Configure o Ambiente: Certifique-se de ter as dependências necessárias instaladas e configure as variáveis de ambiente, se aplicável.
Execute a Aplicação: Inicie a aplicação executando o comando apropriado, conforme as instruções no README do repositório.
Acesse a API: Acesse os endpoints da API usando um cliente HTTP ou um navegador da web.
