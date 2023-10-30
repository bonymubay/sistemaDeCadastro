package com.api.apiBony.services;

import com.api.apiBony.moodel.User;
import com.api.apiBony.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User adicionarUser(User user){
      return userRepository.save(user);
    }

    public List<User> listar(){
        return userRepository.findAll();
    }





}
