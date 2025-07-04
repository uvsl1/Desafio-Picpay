package com.desafioPicpay.Desafio.PicPay.services;

import com.desafioPicpay.Desafio.PicPay.domain.Transaction;
import com.desafioPicpay.Desafio.PicPay.domain.User;
import com.desafioPicpay.Desafio.PicPay.dto.TransactionDTO;
import com.desafioPicpay.Desafio.PicPay.repositories.TransactionRepository;
import com.desafioPicpay.Desafio.PicPay.services.validations.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private UserService userService;

    @Autowired
    private TransactionRepository repository;

    @Autowired
    private List<Validation> validations;

    /*  Teste para mais tarde
    + final
    public TransactionService(List<Validation> validations) {
        this.validations = validations;
    }
    */

    @Transactional
    public Transaction createTransaction(TransactionDTO dto) throws Exception {
        User payer = userService.findUserById(dto.payerId());
        User payee = userService.findUserById(dto.payeeId());

        Transaction transaction = new Transaction(dto, payer, payee);

        validations.forEach(v -> v.validation(transaction));

        payer.setBalance(payer.getBalance().subtract(dto.value()));
        payee.setBalance(payee.getBalance().add(dto.value()));

        userService.saveUser(payer);
        userService.saveUser(payee);

        repository.save(transaction);

        return transaction;
    }
}
