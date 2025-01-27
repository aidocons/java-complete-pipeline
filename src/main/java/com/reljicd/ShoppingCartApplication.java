package com.reljicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;



@SpringBootApplication
public class ShoppingCartApplication {

    Dotenv dotenv = Dotenv.load();
    String value = dotenv.get("VARIABLE_NAME");
    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartApplication.class, args);
    }
}
