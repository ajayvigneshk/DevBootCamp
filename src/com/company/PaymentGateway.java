package com.company;

import java.util.*;

public class PaymentGateway {
    Map<String,IPaymentMode> modes = new HashMap<>();
    // Provide options
    /*enum PaymentEnum {
        NetBanking,CreditCard, DebitCard
    }

    IPaymentMode getPaymentMode(PaymentEnum selector) {
        switch (selector) {
            case NetBanking:
                return  new NetBanking();
            case CreditCard:
                return new CreditCard();
            case DebitCard:
                return  new DebitCard();
            default :
                throw new RuntimeException("Invalid");
        }
    }*/

    void regiserPaymentMode(IPaymentMode mode, String displayKey) {
        modes.put(displayKey,mode);
    }

    public void pay (String displayKey, Double amt) {
        modes.get(displayKey).doPayment(amt);
    }

    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGateway();
        paymentGateway.regiserPaymentMode(new NetBanking(),"netbanking");
        paymentGateway.pay("netbanking", 100d);
    }
}
