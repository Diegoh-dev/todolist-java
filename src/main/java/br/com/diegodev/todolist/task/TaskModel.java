package br.com.diegodev.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
  /*
   * ID
   * Usuário (ID_USUARIO)
   * Descrição
   * Título
   * Data de Inicio
   * Data de termino
   * Prioridade
   */
@Data
@Entity(name = "tb_tasks")
public class TaskModel {
  @Id
  @GeneratedValue(generator = "UUID")
   private UUID id;
   private String description;
   
   //limitar a quantidade de caracter
   @Column(length = 50)
   private String title;
   private LocalDateTime startAt;
   private LocalDateTime endAt;
   private String priority;

   @CreationTimestamp
   private LocalDateTime createdAt;
   
   private UUID idUser;

      //throws Exception = repassa essa excessao(responsabilidade) para a camada acima.
   public void setTitle(String title) throws Exception{
    if(title.length() > 50){
      //cria a excessão
      throw new Exception("O campo title deve conter no máximo 50 caracteres");
    }
    this.title = title;
   }
}
