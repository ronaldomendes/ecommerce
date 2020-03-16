package br.com.rd.ecommerce.controller;

import br.com.rd.ecommerce.model.entity.User;
import br.com.rd.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

//    criando os métodos que farão as requisições
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create-user")
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("find-user/list")
    public List<User> findUser() {
        return userRepository.findAll();
    }
}
