package com.desafioPicpay.Desafio.PicPay.repositories;

import com.desafioPicpay.Desafio.PicPay.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserById(Long id);
}
