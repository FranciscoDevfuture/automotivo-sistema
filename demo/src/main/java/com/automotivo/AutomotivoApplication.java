package com.automotivo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutomotivoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AutomotivoApplication.class, args);
		System.out.println("🚗 Sistema Automotivo rodando em: http://localhost:8080");
	}
}