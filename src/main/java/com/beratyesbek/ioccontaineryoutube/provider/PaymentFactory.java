package com.beratyesbek.ioccontaineryoutube.provider;


public class PaymentFactory implements Factory {

    private static PaymentFactory paymentFactory;

    static {
        paymentFactory = new PaymentFactory();
    }

    public static PaymentFactory getInstance() {
        return paymentFactory;
    }

    @Override
    public PaymentProvider createPaymentProvider() {
        return createMasterpassPaymentProvider();
    }

    private PaymentProvider createBitcoinPaymentProvider() {
        return new BitcoinProvider();
    }

    private PaymentProvider createMasterpassPaymentProvider() {
        return new MasterpassProvider();
    }

    private PaymentProvider createVisaPaymentProvider() {
        return new VisaProvider();
    }
}
