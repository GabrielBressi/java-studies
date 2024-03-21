package br.gabrielbressi.designpatterns.behavioral.strategy.impl;

import br.gabrielbressi.designpatterns.behavioral.strategy.PaymentStrategy;

import java.math.BigDecimal;

public class PaymentByCreditCard implements PaymentStrategy {

    private CreditCard card;

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        card.setAmount(card.getAmount().subtract(amount));
    }

    @Override
    public void collectPaymentDetails() {
        card = new CreditCard("cardNumber", "expiryDate", "cvv");
    }

    @Override
    public boolean validatePaymentDetails() {
        return false;
    }
}
