package cn.sitedev.springcloud.service;

import cn.sitedev.springcloud.entities.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
