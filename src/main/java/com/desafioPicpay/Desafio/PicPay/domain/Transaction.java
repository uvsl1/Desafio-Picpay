package com.desafioPicpay.Desafio.PicPay.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal value;

    @ManyToOne
    private User payer;

    @ManyToOne
    private User payee;

    private LocalDateTime transferTime;

    public Transaction() {
    }

    public Transaction(Long id, BigDecimal value, User payer, User payee, LocalDateTime transferTime) {
        this.id = id;
        this.value = value;
        this.payer = payer;
        this.payee = payee;
        this.transferTime = transferTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public User getPayer() {
        return payer;
    }

    public void setPayer(User payer) {
        this.payer = payer;
    }

    public User getPayee() {
        return payee;
    }

    public void setPayee(User payee) {
        this.payee = payee;
    }

    public LocalDateTime getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(LocalDateTime transferTime) {
        this.transferTime = transferTime;
    }
}
