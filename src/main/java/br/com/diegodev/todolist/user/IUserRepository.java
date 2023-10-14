package br.com.diegodev.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
//primeiro parametro do generator é classe que esta sendo representada.
//o segundo é o tipo de id que a entidade(class) tem

public interface IUserRepository extends JpaRepository<UserModel,UUID>{
  //criado metodo para pesquisar o username
  //faz um select buscando pela coluna username
  UserModel findByUsername(String username);
}
