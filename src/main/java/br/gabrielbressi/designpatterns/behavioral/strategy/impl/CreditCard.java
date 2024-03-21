package br.gabrielbressi.designpatterns.behavioral.strategy.impl;

import java.math.BigDecimal;

public class CreditCard {

    private String cardNumber;
    private String expiryDate;
    private String cvv;

    private BigDecimal amount;


    public CreditCard(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }



}
