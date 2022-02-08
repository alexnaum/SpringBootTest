package com.onaumenko.springboot.springboottest.controller;


import com.onaumenko.springboot.springboottest.entity.User;
import com.onaumenko.springboot.springboottest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class UserRESTController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> showAllUsers(){
        List<User> allUser = userService.getAllUsers();
        return allUser;
    }

   @GetMapping("/users/{id}")
    public User getUser(@PathVariable UUID id){
        User user = userService.getUser(id);
       /* if(user == null){
           throw new NoSuchUserException("There is no user with ID = " + id + " in Database");
        }*/
        return user;
    }

    @PostMapping("/users")
    public User addNewUser(@RequestBody User user){
        userService.saveUser(user);
        return user;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User user){
        userService.saveUser(user);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable UUID id){
        User user = userService.getUser(id);
     /*   if(user == null){
            throw new NoSuchUserException("There is no user with ID = "+id+" in Database");
        }*/
        userService.deleteUser(id);
        return "User with ID = "+id+" was deleted";
    }
}
