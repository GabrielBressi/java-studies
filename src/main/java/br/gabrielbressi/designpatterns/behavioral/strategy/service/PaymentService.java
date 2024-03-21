package br.gabrielbressi.designpatterns.behavioral.strategy.service;

import br.gabrielbressi.designpatterns.behavioral.strategy.PaymentStrategy;

import java.math.BigDecimal;

public class PaymentService {
    private BigDecimal cost;
    private boolean includeDelivery;

    private PaymentStrategy strategy;

    public void processOrder() {
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()) {
            strategy.pay(getTotal());
        }
    }

    private BigDecimal getTotal() {
        return includeDelivery ? cost.add(BigDecimal.valueOf(10)) : cost;
    }

}
