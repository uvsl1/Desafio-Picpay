package com.desafioPicpay.Desafio.PicPay.domain;

import com.desafioPicpay.Desafio.PicPay.dto.UserDTO;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    @Column(unique = true)
    private String cpf;

    @Column(unique = true)
    private String email;

    private String password;

    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    public User() {
    }

    public User(Long id, String userName, String cpf, String email, String password, BigDecimal balance, UserType userType) {
        this.id = id;
        this.userName = userName;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.userType = userType;
    }

    public User(UserDTO dto) {
        this.userName = userName;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.balance = balance;
        this.userType = userType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
