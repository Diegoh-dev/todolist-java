package br.com.diegodev.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;

//o nome do arquivo deve ser o mesmo nome da classe,
//nome de classe com letra maiuscula
/*
MODIFICADORES

* PUBLIC
* PRIVATE
* PROTECTED
*/
@RestController
@RequestMapping("/users")
public class UserController {
  
  /**
   * String (texto)
   * Integer (int) numeros inteiros
   * Double (double) numeros 0.0000
   * Float (float) numeros 0.000
   * Char (A C)
   * Date (data)
   * void 
   */
/*body 
@RequestBody = informa que os dados desse usuario vai vim no bady
*/
//@Autowired = o spring fica responsavel por gerenciar todo ciclo de vida dessa interface
@Autowired
private IUserRepository userRepository;

@PostMapping("/")
  public ResponseEntity create(@RequestBody UserModel userModel){
   var user = this.userRepository.findByUsername(userModel.getUsername());
//ResponseEntity = usado para retornar mensagem se sucesso quanto mensagem de erro.
   if(user != null){
    //mensagem de erro
    //status code
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe");
   }
//toCharArray() transforma a senha em um array de caracteres.
   var passwordHashred = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());

   userModel.setPassword(passwordHashred);
   var userCreated = this.userRepository.save(userModel);
   //mensagem quando for sucesso
   return ResponseEntity.status(HttpStatus.OK).body(userCreated);
  }
}
