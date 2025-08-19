package com.namoro.parabens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParabensApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParabensApplication.class, args);
        System.out.println("🎉 Site rodando em: http://localhost:8080");
    }
}
