package javaCore6;

import java.util.Scanner;

public class Tarefa9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par.");
		} else {
			System.out.println("O número " + numero + " é ímpar.");
		}

		sc.close();
	}
}
