package com.beratyesbek.ioccontaineryoutube.controller;

import com.beratyesbek.ioccontaineryoutube.provider.PaymentFactory;
import com.beratyesbek.ioccontaineryoutube.provider.PaymentProvider;
import com.beratyesbek.ioccontaineryoutube.provider.VisaProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping
    public void pay() {
        PaymentFactory paymentFactory = PaymentFactory.getInstance();
        PaymentProvider provider = paymentFactory.createPaymentProvider();
        provider.pay();
    }
}
