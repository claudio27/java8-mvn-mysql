package com.claudio.db.resource;

import com.claudio.db.model.User;
import com.claudio.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UserResource {

    @Autowired
    UserRepository usersRepository;

    @GetMapping(value = "/all")
    public List<User> getAll() {
        return usersRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<User> persist(@RequestBody final User user) {
        usersRepository.save(user);
        return usersRepository.findAll();
    }

}