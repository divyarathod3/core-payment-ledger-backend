package com.company.wallet.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "wallets")
@Data
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal balance = BigDecimal.ZERO;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;
}