package javaCore6;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor de A (A não pode ser zero):");
		double a = scanner.nextDouble();
		if (a == 0) {
			System.out.println("O valor de A deve ser diferente de zero para uma equação de segundo grau.");
			scanner.close();
			return;
		}

		System.out.println("Digite o valor de B:");
		double b = scanner.nextDouble();

		System.out.println("Digite o valor de C:");
		double c = scanner.nextDouble();

		double delta = b * b - 4 * a * c;

		if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
		} else if (delta == 0) {
			double x1 = -b / (2 * a);
			System.out.println("A equação possui uma raiz real e igual: x = " + x1);
		} else {
			System.out.println("A equação não possui raízes reais (as raízes são complexas).");
		}

		scanner.close();
	}
}
