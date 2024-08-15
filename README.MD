# API CRUD de Clientes - Spring Boot

Esta API foi desenvolvida em Java 21 usando Spring Boot. Ela fornece serviços RESTful para um aplicativo CRUD. A API permite criar, ler, atualizar e excluir registros em uma base de dados.

## 📋 Funcionalidades
* GET localhost:8080/list: Lista todos os itens.
* POST localhost:8080/cadastrar: Cria um novo cliente.
* PUT localhost:8080/editar{id}: Atualiza um cliente existente pelo ID.
* DELETE localhost:8080/delete/{id}: Exclui um cliente pelo ID

## 🚀 Tecnologias
* Java 21: Linguagem de programação utilizada.
* Spring Boot: Framework usado para construção da API.
* Spring Data JPA: Para persistência de dados.
* H2/MySQL/PostgreSQL: Banco de dados (escolha dependendo do ambiente).
Maven: Gerenciador de dependências.
## 🛠️ Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina:

* JDK 21
* Maven

## 🎲 Rodando o Projeto
1. Clone o repositório:
```
git clone https://github.com/usuario/projeto-crud-api.git
```
2. Acesse o diretório do projeto
```
cd projeto-crud-api

```
Acesse a API:
A API estará disponível em http://localhost:8080/api.
## 🔧 Estrutura do Projeto
```
projeto-crud-api/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/projeto/crud/    # Pacotes de código fonte
│   │   │       ├── controller/      # Controladores REST
│   │   │       ├── service/         # Serviços de negócio
│   │   │       ├── repository/      # Repositórios de acesso ao banco de dados
│   │   │       ├── model/           # Modelos/entidades
│   │   │       └── CrudApplication.java # Classe principal
│   │   └── resources/
│   │       ├── application.properties # Configurações da aplicação
│   │       └── data.sql               # Script para popular o banco de dados (opcional)
│   └── test/                          # Testes automatizados
│
├── pom.xml                            # Arquivo de configuração do Maven
└── README.md                          # Documentação do projeto

```
## 📄 Endpoints da API
### Listar todos os itens
* URL: /api/clientes
* Método: GET
* Resposta: 200 OK (Lista de itens)
### Obter um cliente por ID
* URL: /api/cliente/{id}
* Método: GET
* Resposta: 200 OK (cliente encontrado) ou 404 Not Found (cliente não encontrado)
### Criar um novo cliente
* URL: /api/cliente
* Método: POST
* Corpo da Requisição: JSON com os dados do cliente
* Resposta: 201 Created (cliente criado)
### Atualizar um cliente existente
* URL: /api/cliente/{id}
* Método: PUT
* Corpo da Requisição: JSON com os dados atualizados
Resposta: 200 OK (cliente atualizado) ou 404 Not Found (cliente não encontrado)
### Excluir um cliente
* URL: /api/cliente/{id}
* Método: DELETE
* Resposta: 204 No Content (cliente excluído) ou 404 Not Found (cliente não encontrado)

## ✒️ Autores
Bfrjunior

## 🎁 Expressões de gratidão

* Conte a outras pessoas sobre este projeto 📢;
* Convide alguém da equipe para uma cerveja 🍺;
* etc.
