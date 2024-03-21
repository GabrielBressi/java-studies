package br.gabrielbressi.designpatterns.behavioral.strategy.impl;

import br.gabrielbressi.designpatterns.behavioral.strategy.PaymentStrategy;

import java.math.BigDecimal;

public class PaymentByPayPal implements PaymentStrategy {

    private String email;
    private String password;

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }

    @Override
    public void collectPaymentDetails() {
        email = "...";
        password = "...";
    }

    @Override
    public boolean validatePaymentDetails() {
        return false;
    }
}
