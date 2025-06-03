package com.desafioPicpay.Desafio.PicPay.domain;

import com.desafioPicpay.Desafio.PicPay.dto.TransactionDTO;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="tb_transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="transaction_value")
    private BigDecimal value;

    @ManyToOne
    @JoinColumn(name = "payer_id", nullable = false)
    private User payer;

    @ManyToOne
    @JoinColumn(name = "payee_id", nullable = false)
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

    public Transaction(TransactionDTO dto, User payer, User payee) {
        this.value = dto.value();
        this.payer = payer;
        this.payee = payee;
        this.transferTime = LocalDateTime.now();
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
