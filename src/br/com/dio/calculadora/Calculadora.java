package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		float soma = soma (a,b);
		float subtracao = subtracao(a,b);
		float multiplicacao = multiplicacao (a,b);
		float divisao = divisao (a,b);
		
		System.out.println("soma " + soma);
		System.out.println("sub " + subtracao);
		System.out.println("mult " + multiplicacao);
		System.out.println("div " + divisao);
	}

	public static float soma(int a, int b) {
		return a + b;
	}
	
	public static float subtracao(int a, int b) {
		return a - b;
	}
	
	public static float divisao(int a, int b) {
		return a / b;
	}
	
	public static float multiplicacao(int a, int b) {
		return a * b;
	}
	
}
