package pl.javastart.demotime.controller;

import org.springframework.web.bind.annotation.*;
import pl.javastart.demotime.model.User;

import java.util.Random;

@RestController
public class UserController {

    @GetMapping("/api/user")
    public User getUser(@RequestParam String name){
        Random random = new Random();

        User user = new User();
        user.setName(name);
        user.setAge(random.nextInt(100));

        return user;

    }

    @PostMapping("/api/user")
    public User saveUser(@RequestBody User user){
        System.out.println("User to save: " + user);
        user.setAge(0);
        return user;
    }

}
