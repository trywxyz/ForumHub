# ForumHub
Desafio ONE Alura Forum Hub

# FórumHub API

Aqui está o **README.md** completo e pronto para você copiar e colar:

```markdown
# FórumHub API

Bem-vindo à API do FórumHub, uma aplicação de fórum para a gestão de tópicos e autenticação de usuários.

## Requisitos

- Java 11 ou superior
- Spring Boot 3
- Maven
- Banco de dados (MySQL ou H2)
- Ferramenta de teste de API (Postman ou Insomnia)

## Configuração do Projeto



## Endpoints

### 1. **Login de Usuário**

- **URL**: `/login`
- **Método**: `POST`
- **Corpo**:

   ```json
   {
     "username": "usuario",
     "password": "senha"
   }
   ```

- **Resposta**:

   ```json
   {
     "token": "JWT_TOKEN"
   }
   ```

### 2. **Tópicos**

#### Listar Tópicos

- **URL**: `/topicos`
- **Método**: `GET`
- **Cabeçalho**: `Authorization: Bearer <JWT_TOKEN>`

#### Detalhar Tópico

- **URL**: `/topicos/{id}`
- **Método**: `GET`
- **Cabeçalho**: `Authorization: Bearer <JWT_TOKEN>`

#### Criar Tópico

- **URL**: `/topicos`
- **Método**: `POST`
- **Cabeçalho**: `Authorization: Bearer <JWT_TOKEN>`
- **Corpo**:

   ```json
   {
     "titulo": "Título do Tópico",
     "mensagem": "Mensagem do tópico",
     "autor": "Nome do Autor",
     "curso": "Curso"
   }
   ```

#### Atualizar Tópico

- **URL**: `/topicos/{id}`
- **Método**: `PUT`
- **Cabeçalho**: `Authorization: Bearer <JWT_TOKEN>`
- **Corpo**:

   ```json
   {
     "titulo": "Novo Título",
     "mensagem": "Mensagem atualizada",
     "status": "INATIVO"
   }
   ```

#### Excluir Tópico

- **URL**: `/topicos/{id}`
- **Método**: `DELETE`
- **Cabeçalho**: `Authorization: Bearer <JWT_TOKEN>`

## Testando a API

- Use **Postman** ou **Insomnia** para testar os endpoints.
- Adicione o token JWT obtido ao fazer login no cabeçalho de cada requisição:

```
Authorization: Bearer <JWT_TOKEN>
```

## Licença

Distribuído sob a licença MIT.
```

Agora você pode copiar e colar diretamente no seu arquivo README.md. Se precisar de algo mais, é só falar!

