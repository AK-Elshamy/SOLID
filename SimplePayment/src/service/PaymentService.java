package service;

import payment.PaymentMethod;

public class PaymentService {
    private final PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void payment(){
        paymentMethod.pay();
    }
}
