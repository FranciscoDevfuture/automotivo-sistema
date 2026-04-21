# 🚗 Sistema Automotivo - Gestão de Estoque de Veículos

## 📋 Sobre o Projeto

Sistema CRUD desenvolvido em Java com Spring Boot para gestão de estoque de veículos. Permite cadastrar, consultar, filtrar, atualizar e remover veículos de forma eficiente.

## 🎯 Funcionalidades

- ✅ Cadastrar veículos (marca, modelo, ano, cor, preço, quilometragem, status)
- ✅ Listar todos os veículos
- ✅ Filtrar veículos por preço, status e ano
- ✅ Atualizar informações do veículo
- ✅ Remover veículo (remoção lógica)

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão |
|------------|--------|
| Java | 17 |
| Spring Boot | 3.5.13 |
| Spring Data JPA | - |
| MySQL | 8.0 |
| Maven | - |

## 📁 Estrutura do Projeto
src/main/java/com/automotivo/
├── controller/ # Endpoints da API
├── service/ # Regras de negócio
├── repository/ # Acesso ao banco de dados
├── model/ # Entidades
├── enums/ # StatusVeiculo
└── AutomotivoApplication.java


## 🔧 Como Executar

1. Clonar o repositório
2. Criar banco de dados: `CREATE DATABASE automotivo_db;`
3. Configurar senha no `application.properties`
4. Executar: `./mvnw spring-boot:run`

## 📡 Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/api/veiculos` | Listar veículos |
| GET | `/api/veiculos/filtros?status=DISPONIVEL` | Filtrar |
| POST | `/api/veiculos` | Cadastrar |
| PUT | `/api/veiculos/{id}` | Atualizar |
| DELETE | `/api/veiculos/{id}` | Remover |

## 👨‍💻 Autor

**Francisco Santos**  
GitHub: [@FranciscoDevfuture](https://github.com/FranciscoDevfuture)
