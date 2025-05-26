package com.desafioPicpay.Desafio.PicPay.repositories;

import com.desafioPicpay.Desafio.PicPay.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TransactionRepository extends JpaRepository<Transaction, Long>  {
}
