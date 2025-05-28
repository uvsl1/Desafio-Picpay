package com.desafioPicpay.Desafio.PicPay.services.validations.impl;

import com.desafioPicpay.Desafio.PicPay.domain.Transaction;
import com.desafioPicpay.Desafio.PicPay.services.validations.Validation;
import org.springframework.stereotype.Component;

@Component
public class ValidationBalanceImpl implements Validation {

    @Override
    public void validation(Transaction transaction) {
        if (transaction.getPayer().getBalance().compareTo(transaction.getValue()) < 0) {
            throw new IllegalArgumentException("Insufficient balance.");
        }
    }
}
