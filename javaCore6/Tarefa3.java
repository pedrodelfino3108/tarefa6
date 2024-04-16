package javaCore6;

import java.util.Scanner;

public class Tarefa3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota:");
		double nota1 = sc.nextDouble();

		System.out.println("Digite a segunda nota:");
		double nota2 = sc.nextDouble();

		System.out.println("Digite a terceira nota:");
		double nota3 = sc.nextDouble();

		System.out.println("Digite a quarta nota:");
		double nota4 = sc.nextDouble();

		sc.close();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 5) {
			System.out.println("Aluno aprovado com média: " + media);
		} else {
			System.out.println("Aluno reprovado com média: " + media);
		}
	}
}
