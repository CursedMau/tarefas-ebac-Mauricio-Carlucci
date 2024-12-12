package br.com.mau;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite a nota da primeira prova: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Digite a nota da segunda prova: ");
		double nota2 = scanner.nextDouble();

		System.out.print("Digite a nota da terceira prova: ");
		double nota3 = scanner.nextDouble();
		
		System.out.print("Digite a nota da quarta prova: ");
		double nota4 = scanner.nextDouble();
		
		/**
		 * Calculo da media
		 */
		
		double media = (nota1 + nota2+ nota3 + nota4) /4;
		System.out.println(nome);
		System.out.println("Sua media e: " +media);
	}
	
	
	}

}
