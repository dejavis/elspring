package com.example.midemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MidemoApplication implements CommandLineRunner {

	public static void main(String[] args) {

        SpringApplication.run(MidemoApplication.class, args);
	}
    private RazorpayPaymentService paymentService = new RazorpayPaymentService();

    public MidemoApplication(RazorpayPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void run(String... args) throws Exception{
    String payment = paymentService.pay();
        System.out.println("Payment done: "+payment);
    }
}
