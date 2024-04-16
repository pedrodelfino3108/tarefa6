package javaCore6;

import java.util.Scanner;

public class Tarefa7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("Digite o número " + (i + 1) + ":");
			numeros[i] = sc.nextInt();
		}

		System.out.println("Números divisíveis por 2 e 3:");

		boolean encontrado = false;
		for (int numero : numeros) {
			if (numero % 6 == 0) {
				System.out.println(numero);
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("Nenhum dos números é divisível por 2 e 3 ao mesmo tempo.");
		}

		sc.close();
	}
}
