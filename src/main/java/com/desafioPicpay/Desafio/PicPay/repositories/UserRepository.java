package com.desafioPicpay.Desafio.PicPay.repositories;

import com.desafioPicpay.Desafio.PicPay.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
