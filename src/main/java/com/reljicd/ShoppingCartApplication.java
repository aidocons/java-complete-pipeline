package com.reljicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;



@SpringBootApplication
public class ShoppingCartApplication {

    Dotenv dotenv = Dotenv.load();
    int value = dotenv.get("VARIABLE_NAME");
    int sum = value + 5;
    int sum1=1+2;
    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartApplication.class, args);
    }
}
