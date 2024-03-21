package br.gabrielbressi.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {

    void pay (BigDecimal amount);
    void collectPaymentDetails();

    boolean validatePaymentDetails();
}
