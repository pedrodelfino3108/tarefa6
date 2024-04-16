package javaCore6;

import java.util.Scanner;

public class Tarefa10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número entre 1 e 9:");
		int numero = sc.nextInt();

		if (numero >= 1 && numero <= 9) {
			System.out.println("O valor está na faixa permitida.");
		} else {
			System.out.println("O valor está fora da faixa permitida.");
		}

		sc.close();
	}
}
