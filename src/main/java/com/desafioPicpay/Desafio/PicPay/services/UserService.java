package com.desafioPicpay.Desafio.PicPay.services;

import com.desafioPicpay.Desafio.PicPay.domain.User;
import com.desafioPicpay.Desafio.PicPay.dto.UserDTO;
import com.desafioPicpay.Desafio.PicPay.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User findUserById(Long id) throws Exception {
        return this.repository.findUserById(id).orElseThrow(() -> new Exception("User not found."));
    }

    public void saveUser(User user){
        this.repository.save(user);
    }

    public User createUser(UserDTO dto) {
        User newUser = new User(dto);
        this.saveUser(newUser);
        return newUser;
    }
}
