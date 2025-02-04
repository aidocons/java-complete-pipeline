package com.reljicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;



@SpringBootApplication
public class ShoppingCartApplication {

    Dotenv dotenv = Dotenv.load();
    int value = Integer.parseInt(dotenv.get("V"));
    int sum = value + 5;
    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartApplication.class, args);
    }
}
