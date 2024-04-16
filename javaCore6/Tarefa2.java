package javaCore6;

import java.util.Scanner;

public class Tarefa2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número inteiro (positivo ou negativo):");
		int numero = scanner.nextInt();

		scanner.close();

		int modulo = numero < 0 ? -numero : numero;

		System.out.println("O valor absoluto do número é: " + modulo);
	}
}
