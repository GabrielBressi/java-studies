package br.gabrielbressi.designpatterns.creational.factory.example1;

import br.gabrielbressi.designpatterns.creational.factory.example1.enums.PaymentMethod;
import br.gabrielbressi.designpatterns.creational.factory.example1.impl.ApplePayPayment;
import br.gabrielbressi.designpatterns.creational.factory.example1.impl.CreditCardPayment;
import br.gabrielbressi.designpatterns.creational.factory.example1.impl.GooglePayPayment;
import br.gabrielbressi.designpatterns.creational.factory.example1.impl.PayPalPayment;

import java.text.MessageFormat;

public class PaymentFactory {

    public static Payment create(PaymentMethod paymentMethod) throws ClassNotFoundException {
        switch (paymentMethod) {
            case CREDIT_CARD -> {
                return new CreditCardPayment();
            }
            case PAYPAL -> {
                return new PayPalPayment();
            }
            case GOOGLE_PAY -> {
                return new GooglePayPayment();
            }
            case APPLE_PAY -> {
                return new ApplePayPayment();
            }
            default -> {
                throw new ClassNotFoundException(MessageFormat.format(
                        "{0} is not currently supported as a payment method.", paymentMethod
                ));
            }
        }
    }

}
