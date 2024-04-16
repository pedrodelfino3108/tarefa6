package javaCore6;

import java.util.Scanner;

public class Tarefa12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		String nome = sc.nextLine();

		System.out.println("Digite seu sexo (M para masculino ou F para feminino):");
		String sexo = sc.nextLine();

		if (sexo.equalsIgnoreCase("M")) {
			System.out.println("Ilmo Sr. " + nome);
		} else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Ilma Sra. " + nome);
		} else {
			System.out.println("Sexo não reconhecido.");
		}

		sc.close();
	}
}
