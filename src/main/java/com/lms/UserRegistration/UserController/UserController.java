package com.lms.UserRegistration.UserController;


import com.lms.UserRegistration.User.User;
import com.lms.UserRegistration.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/company")
@CrossOrigin(origins = "http://localhost:4200") // Allow requests from the Angular app URL
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody @Valid User user) {
        User savedUser = userService.registerUser(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

    @GetMapping("/get")
    public List<User> getAll(){
        return  userService.getAllUsers();
    }

    @GetMapping("/hello")
    public String get(){
        return  "hello";
    }
}
