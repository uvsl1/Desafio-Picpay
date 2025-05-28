package com.desafioPicpay.Desafio.PicPay.dto;

import com.desafioPicpay.Desafio.PicPay.domain.UserType;

import java.math.BigDecimal;

public record UserDTO(String userName, String cpf, String email, String password, BigDecimal balance, UserType userType) {
}
