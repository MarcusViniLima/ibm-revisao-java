package com.br.marcus.console;


import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaApplication {

	public static void main(String[] args) {
		System.out.println("===================Bem vindo ao mundo a java=============");
		//SpringApplication.run(LogicaApplication.class, args);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome?");
		String nome = sc.nextLine();
		System.out.println("Seja Bem Vindo, "+nome+"!");
		
	}

}
