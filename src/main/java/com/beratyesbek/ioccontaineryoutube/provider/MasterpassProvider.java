package com.beratyesbek.ioccontaineryoutube.provider;

public class MasterpassProvider implements PaymentProvider {
    @Override
    public void pay() {
        System.out.println("Paid with Masterpass");
    }
}
