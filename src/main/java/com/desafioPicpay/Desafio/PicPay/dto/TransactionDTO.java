package com.desafioPicpay.Desafio.PicPay.dto;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long payerId, Long payeeId) {
}
