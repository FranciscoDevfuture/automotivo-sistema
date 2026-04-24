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


PRINTS DA APLICAÇÃO


<img width="1341" height="492" alt="image" src="https://github.com/user-attachments/assets/35054ebf-584a-4861-a43a-bb406dfd15de" />
<img width="1309" height="590" alt="image" src="https://github.com/user-attachments/assets/f1bd108b-c402-461a-8ac9-0ea466c1f5ac" />
<img width="1264" height="455" alt="image" src="https://github.com/user-attachments/assets/9d5f6e5a-5568-4264-bc75-b53294626a92" />
<img width="1289" height="281" alt="image" src="https://github.com/user-attachments/assets/d01179c3-9860-4a32-ab14-6fbfbb31b513" />
<img width="1316" height="306" alt="image" src="https://github.com/user-attachments/assets/8c038d84-38cc-41ca-96e3-34f5cacf2007" />

POSTMAN
<img width="779" height="659" alt="image" src="https://github.com/user-attachments/assets/8ce47a65-ccd4-4487-b290-42dc128897d8" />
<img width="776" height="655" alt="image" src="https://github.com/user-attachments/assets/b242e372-95cf-4171-ba2e-9588bf12f52a" />

ESTRUTURA DO PROJETO
<img width="615" height="560" alt="image" src="https://github.com/user-attachments/assets/abbc54cc-adaf-4a71-9fbc-8008decbd2c9" />

BANCO DE DADOS MYSQL
<img width="853" height="149" alt="image" src="https://github.com/user-attachments/assets/c62565ed-8afc-468f-9bc3-0553745b5371" />




