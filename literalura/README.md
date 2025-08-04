
# 📚 Literalura

Literalura é uma aplicação Java que consome a [API Gutendex](https://gutendex.com/) para buscar e cadastrar livros e autores em um banco de dados PostgreSQL. A aplicação oferece uma interface de texto interativa (via `Scanner`) para explorar livros, autores vivos, idiomas e estatísticas literárias.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- PostgreSQL
- Gutendex API

---

## 🎮 Funcionalidades

- Buscar e cadastrar livros pela API do Gutendex
- Cadastrar autores associados aos livros
- Listar todos os livros cadastrados
- Listar todos os autores cadastrados
- Listar autores vivos por ano de nascimento
- Filtrar livros por idioma
- Exibir os 5 livros mais baixados
- Validações para evitar duplicações de autores/livros no banco

---

## 🛠️ Como Executar o Projeto

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/literalura.git
cd literalura
```

### 2. Compile o projeto com Maven

```bash
mvn clean install
```

### 3. Configure o banco de dados PostgreSQL

Certifique-se de ter o PostgreSQL instalado e um banco criado (ex: `literalura`).

No arquivo `src/main/resources/application.properties`, configure:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### 4. Execute a aplicação

```bash
mvn spring-boot:run
```

A aplicação será executada no terminal com a interface interativa de texto.

---

## 📈 Exemplo de Uso

```text
--- MENU LITERALURA ---
1 - Buscar livros pela API
2 - Listar livros cadastrados
3 - Listar autores cadastrados
4 - Listar autores vivos por ano
5 - Listar livros por idioma
6 - Top 5 livros mais baixados
0 - Sair
```

---

## 🌱 Funcionalidades Futuras

- Exportação dos dados para CSV/JSON
- Integração com outras APIs literárias
- Interface gráfica (JavaFX ou Web)
- Login e autenticação de usuários
- Tradução automática de sinopses

---

## 👤 Autor

Desenvolvido por **Matheus Lino**  
GitHub: [Matheus Lino](https://github.com/matheuslino)

---

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
