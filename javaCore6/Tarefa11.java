package javaCore6;

import java.util.Scanner;

public class Tarefa11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro:");
		int numero = sc.nextInt();

		if (numero <= 3) {
			System.out.println("O número inserido é: " + numero);
		}

		sc.close();
	}
}
