package br.gabrielbressi.designpatterns.creational.factory.example1.impl;

import br.gabrielbressi.designpatterns.creational.factory.example1.Payment;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(BigDecimal amount) {
        System.out.println(MessageFormat.format("Successfully paid ${0} to merchant using a Credit Card", amount));
    }

}
