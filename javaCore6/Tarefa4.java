package javaCore6;

import java.util.Scanner;

public class Tarefa4 {
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

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 7) {
			System.out.println("Aluno aprovado com média: " + media);
		} else {
			System.out.println("Média de " + media + " insuficiente para aprovação direta.");
			System.out.println("Digite a nota do exame:");
			double notaExame = sc.nextDouble();

			double novaMedia = (media + notaExame) / 2;

			if (novaMedia >= 5) {
				System.out.println("Aluno aprovado em exame com média: " + novaMedia);
			} else {
				System.out.println("Aluno reprovado mesmo após exame com média: " + novaMedia);
			}
		}
	}
}