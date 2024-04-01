package com.beratyesbek.ioccontaineryoutube.provider;

public class BitcoinProvider implements PaymentProvider {
    @Override
    public void pay() {
        System.out.println("Paid with Bitcoin");
    }
}
