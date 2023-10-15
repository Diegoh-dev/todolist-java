
# TODOLIST API

### DESCRIÇÃO :
O todolis api CRUD é um aplicativo web que permite aos usuários criar, ler, atualizar sua lista de tarefas. Os usuários podem criar novas tarefas, visualizar as tarefas já existente e modificar as tarefas no sistema. O aplicativo também inclui um sistema de login e registro para proteger os dados do usuário. Todolist api CRUD é construído usando Java 17, maven, spring boot, h2-database, lombok e bcrypt para criptografar senha e usuário, tornando-o escalonável e eficiente.

### ROUTES :

- `POST /users/`: Essa rota recebe : `name`, `username` e `password` do cliente que são passados ​​no corpo da solicitação em `JSON`.

- `POST /tasks/`: Essa rota recebe : `description`, `title`, `priority`, `startAt` e `endAt` do cliente que são passados ​​no corpo da solicitação em `JSON`.

- `GET /tasks/`:Rota que lista todas as tarefas já realizadas.

- `PUT /tasks/:id`: Essa rota altera a tarefa já feita.

### Example

Se chamar a rota `POST /users/` passando: 

```js

 {
    "name":"Diego Dev",
    "username":"diegoteste",
    "password":"12345"
}

A api retorna: 


[
  {
    "id": "0c27917a-7f16-486d-87a9-3e689e6af5ae",
    "username": "diegoteste",
    "name": "Diego Dev",
    "password": "$2a$12$ApXosOx/FMoOA7wiB/EpJu3ErQgW5AIHUVFHPZRg17r30nswjJ7sW",
    "createdAt": "2023-10-15T14:26:43.372366994"
}
];
```


Se chamar a rota `POST /tasks/` passando: 

```js
{
    "description":"Tarefa para aprender react native",
    "title":"React native teste ",
    "priority":"Alta",
    "startAt":"2023-10-15T12:30:00",
    "endAt":"2023-10-15T20:35:00"
}
```

A api retorna: 

```js
[
  {
    "id": "f8aadc2e-ece7-4a73-a4ff-830d989b67ca",
    "description": "Tarefa para aprender react native",
    "title": "React native teste ",
    "startAt": "2023-10-16T12:30:00",
    "endAt": "2023-10-16T20:35:00",
    "priority": "Alta",
    "createdAt": "2023-10-15T14:31:04.477320152",
    "idUser": "3a3a07a7-fdc1-44a8-bc52-e849a6891eee"
}
];
```

Se chamar a rota `GET /tasks/` já logado no sistema api retorna todas as tarefas cadastradas: 


```js
[
    {
        "id": "f8aadc2e-ece7-4a73-a4ff-830d989b67ca",
        "description": "Tarefa para aprender react native",
        "title": "React native teste ",
        "startAt": "2023-10-16T12:30:00",
        "endAt": "2023-10-16T20:35:00",
        "priority": "Alta",
        "createdAt": "2023-10-15T14:31:04.47732",
        "idUser": "3a3a07a7-fdc1-44a8-bc52-e849a6891eee"
    },
    {
        "id": "4a36f1b7-2266-4d31-a17a-7958f365a0a8",
        "description": "Tarefa para aprender react native",
        "title": "React native teste ",
        "startAt": "2023-10-16T12:30:00",
        "endAt": "2023-10-16T20:35:00",
        "priority": "Alta",
        "createdAt": "2023-10-15T14:34:57.867348",
        "idUser": "3a3a07a7-fdc1-44a8-bc52-e849a6891eee"
    }
]
```

Se chamar a rota `PUT /tasks/4a36f1b7-2266-4d31-a17a-7958f365a0a8` passando: 

```js
[
   {
   "title": "teste alteração ",
    "priority": "alta"
}
];
```

A api retorna: 

```js
[
  {
    "id": "f8aadc2e-ece7-4a73-a4ff-830d989b67ca",
    "description": "Tarefa para aprender react native",
    "title": "teste alteração ",
    "startAt": "2023-10-16T12:30:00",
    "endAt": "2023-10-16T20:35:00",
    "priority": "alta",
    "createdAt": "2023-10-15T14:31:04.47732",
    "idUser": "3a3a07a7-fdc1-44a8-bc52-e849a6891eee"
}
];
```



### TECNOLOGIAS  :

As seguintes ferramentas foram usadas neste projeto:

- Java
- Maven
- Spring Boot
- UUID
- H2-database
- Lombok
- Bcrypt
- Render (DEPLOY)
 

## 🤝 Contribuidores


- [@Diegoh-dev](https://github.com/Diegoh-dev)
