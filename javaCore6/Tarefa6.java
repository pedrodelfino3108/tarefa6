package javaCore6;

import java.util.Scanner;

public class Tarefa6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor de A:");
		int a = scanner.nextInt();
		System.out.println("Digite o valor de B:");
		int b = scanner.nextInt();
		System.out.println("Digite o valor de C:");
		int c = scanner.nextInt();

		int primeiro, segundo, terceiro;

		if (a < b && a < c) {
			primeiro = a;
			if (b < c) {
				segundo = b;
				terceiro = c;
			} else {
				segundo = c;
				terceiro = b;
			}
		} else if (b < a && b < c) {
			primeiro = b;
			if (a < c) {
				segundo = a;
				terceiro = c;
			} else {
				segundo = c;
				terceiro = a;
			}
		} else {
			primeiro = c;
			if (a < b) {
				segundo = a;
				terceiro = b;
			} else {
				segundo = b;
				terceiro = a;
			}
		}

		System.out.println("Os valores em ordem crescente são: " + primeiro + ", " + segundo + ", " + terceiro);

		scanner.close();
	}
}
