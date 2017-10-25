package com.company;

public interface  IPaymentMode {
    boolean doPayment(double amt);
}
class NetBanking implements  IPaymentMode {

    @Override
    public boolean doPayment(double amt) {
        System.out.println("NetBanking.doPayment");
        return false;
    }
}
class CreditCard implements  IPaymentMode {

    @Override
    public boolean doPayment(double amt) {
        System.out.println("CreditCard.doPayment");
        return false;
    }
}

class DebitCard implements  IPaymentMode {

    @Override
    public boolean doPayment(double amt) {
        System.out.println("DebitCard.doPayment");
        return false;
    }
}

