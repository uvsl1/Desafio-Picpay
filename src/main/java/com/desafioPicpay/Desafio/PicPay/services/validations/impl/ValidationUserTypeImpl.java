package com.desafioPicpay.Desafio.PicPay.services.validations.impl;

import com.desafioPicpay.Desafio.PicPay.domain.Transaction;
import com.desafioPicpay.Desafio.PicPay.domain.UserType;
import com.desafioPicpay.Desafio.PicPay.services.validations.Validation;
import org.springframework.stereotype.Component;

@Component
public class ValidationUserTypeImpl implements Validation {

    @Override
    public void validation(Transaction transaction) {
        if (transaction.getPayer().getUserType() == UserType.MERCHANT) {
            throw new IllegalArgumentException("Merchants cannot make transactions.");
        }
    }
}