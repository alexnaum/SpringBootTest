package com.onaumenko.springboot.springboottest.service;


import com.onaumenko.springboot.springboottest.dao.UserRepository;
import com.onaumenko.springboot.springboottest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public User getUser(UUID id) {
        User user = null;
        Optional<User> opt = userRepository.findById(id);
        if(opt.isPresent()){
            user = opt.get();
        }
        return user;
    }

    @Override
    public void deleteUser(UUID id) {
      userRepository.deleteById(id);
    }
}
