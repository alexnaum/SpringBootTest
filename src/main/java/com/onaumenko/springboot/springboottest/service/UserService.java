package com.onaumenko.springboot.springboottest.service;


import com.onaumenko.springboot.springboottest.entity.User;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(UUID id);

    public void deleteUser(UUID id);
}
