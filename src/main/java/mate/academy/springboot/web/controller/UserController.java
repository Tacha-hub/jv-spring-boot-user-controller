package mate.academy.springboot.web.controller;


import mate.academy.springboot.web.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    public List<User> getUsers() {
        return List.of(new User(1L, "bob@i.ua"), new User(2L, "alice@i.ua"));
    }

    public String postUsers(User user) {
        return "User created. Id: %s, email: %s".formatted(user.email(), user.email());
    }
}
