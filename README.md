# 🧭 API de Consulta de CEP

Este projeto é uma API RESTful desenvolvida com **Spring Boot** que consome o serviço público **ViaCEP**, permitindo buscar automaticamente informações de endereço (rua, bairro, cidade e estado) a partir de um número de CEP.

---

## 🚀 Objetivo

Facilitar o preenchimento de endereços em sistemas de e-commerce ou cadastros, oferecendo um endpoint interno que simplifica a integração com a API ViaCEP.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Lombok**
- **Spring Boot DevTools**

> Nenhum banco de dados é utilizado neste projeto.

---

## 📂 Estrutura do Projeto

```
src
 └── main
     ├── java
     │    └── com.exemplo.cep
     │         ├── CepApplication.java          # Classe principal
     │         ├── controller
     │         │     └── CepController.java     # Controlador da API
     │         ├── service
     │         │     └── CepService.java        # Serviço que consome o ViaCEP
     │         └── model
     │               └── Endereco.java          # Modelo de dados do endereço
     └── resources
          └── application.properties             # Configurações básicas
```

---

## 🔍 Endpoints

### 🔹 Consultar endereço por CEP

**Requisição:**
```
GET /api/cep/{cep}
```

**Exemplo:**
```
GET http://localhost:8080/api/cep/01001000
```

**Resposta (JSON):**
```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ibge": "3550308",
  "gia": "1004",
  "ddd": "11",
  "siafi": "7107"
}
```

---

## 🧪 Testando com Postman

1. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```
2. Abra o **Postman**.
3. Crie uma nova requisição:
   - Método: `GET`
   - URL: `http://localhost:8080/api/cep/01001000`
4. Clique em **Send**.
5. Verifique a resposta JSON retornada com os dados do endereço.

---

## 💡 Funcionamento Interno

- O **Controller** recebe o CEP via requisição HTTP.
- O **Service** utiliza o `RestTemplate` para consultar a API pública do ViaCEP.
- O resultado é convertido automaticamente em um objeto `Endereco` e retornado como JSON.

---

## 🧾 Exemplo de Uso Prático

Pode ser usado em:
- Formulários de cadastro em sites ou aplicativos;
- Sistemas de e-commerce;
- Aplicações internas que precisem validar ou completar endereços brasileiros automaticamente.

---

## 🧑‍💻 Autor
**Ana Picoli**
