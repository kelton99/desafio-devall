
#  **Desafio Técnico: crie seu próprio /dev/All - backend**


##  **Desafio**
Implementar uma versão simplificada do backend /dev/All.

**Endpoints**:
- **Get** /api/v2/post
  Buscar posts cujos campo cujo título e resumo se assemelhem ao termo fornecido, deve vir ordenado pela data de maneira decrescente e a url da postagem não pode ser exposta.

- **Post** post/clique/{id}
  Registra o clique em um determinado post e retorna o link do conteúdo original provido pelo crawler.
---  

##  **Tecnologias Usadas**

### **Spring Boot**
Uma framework que toma uma visão opinada do já poderoso container de Injeção de Dependências Spring para facilitar e acelerar a criação de aplicações, com automação de scripts de build e servidores embutidos.

### **MySql**
Um SGBD com décadas de experimentação e que é responsável por gerenciar enormes volumes de dados das maiores companhias do planeta com robustez, velocidade e segurança.

### **Docker**
Uma ferramenta de criação de containers para facilitar a distribuição de aplicações

### **Liquibase**
Uma ferramenta para administrar a evolução do banco de dados de uma aplicação através de "migrations"

### **Swagger UI**

Utiliza a especificação da Open Api para automaticamente gerar documentação para a API e um ambiente para testa-la.
  
---

### **Como executar o projeto**
Certifique-se de estar com o terminal na raiz do projeto e rode os seguintes comandos.
```bash
  docker-compose up -d
```
Para subir o banco de dados, em seguida

```bash
./gradlew bootRun
```
Para executar o projeto, as migrations serão executadas automaticamente.
 
Em seguida acesse o endereço `http://localhost:8080/swagger-ui/index.html` para testar a API no ambiente Swagger