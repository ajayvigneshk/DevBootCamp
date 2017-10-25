package com.company;

public class Owner {
    Wallet wallet;

    Owner() {
        wallet = new Wallet();
    }

    static class Wallet {
        float amount;

        void putMoney(float toPut) {
            amount += toPut;
        }

        float takeMoney(float toTake) { // return amt reqd.
            amount -= toTake;
            return toTake;
        }

        boolean checkAmount(float amt) {
            return amt <= amount && amt >0;
        }

    }

    void put(float toPut) {
        wallet.putMoney(toPut);
    }

    void take(float toTake) {
        if (wallet.checkAmount(toTake))
            wallet.takeMoney(toTake);
//        else

    }

    public static void main(String[] args) {
        Owner owner = new Owner();
        owner.put(100);

    }


}
