package br.com.diegodev.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

//@Data = coloca os getters e setters
// @Getter = coloca apenas os metodos getters
//@Setter = coloca apenas os metodos setters

@Data
@Entity(name = "tb_users")
public class UserModel {
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  //caso queira colocar em apenas um atributo,colocar acima do mesmo.
  //@Getter
  //@Column(name = "usuarios")//nomeado username para usuario no banco de dados
  @Column(unique = true) //informando que esse dado é unico no banco, não pode ser repetido.
 private String username;
 private String name;
 private String password;
 //mudar para private

 //getters e setters

  //quando o atributo foi criado no meu banco de dados.
  @CreationTimestamp
  private LocalDateTime createdAt;
}
