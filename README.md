

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
### **Modelagem do banco de dados**

O banco consiste em duas tabelas, posts que guarda o titulo, resumo, autor, url e data, a tabela clicks guarda o id do post utilizando chave estrangeira e a data do click, permitindo serem consultadas de várias formas.

---

### **Raciocínio de Implementação**

Segue uma arquitetura em camadas padrão, com a exclusão da camada service dado a falta de necessidade por ser um projeto diminuto.
A rota de busca recebe como RequestParam o termo de busca, e os números em relação a paginação, divergindo levemente da especificação do openapi.yml fornecido, dando um pouco mais de flexibilidade para o client que está consumindo o serviço a ajudar quanta informação ele deseja.
A rota de clique recebe o id do post, confere se o post  com aquele id existe, registra o click e retorna a url, caso o post não exista, apenas retorna um código 404 e uma mensagem.

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
