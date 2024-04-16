package javaCore6;

import java.util.Scanner;

public class Tarefa1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número inteiro:");
		int primeiroNumero = sc.nextInt();

		System.out.println("Digite o segundo número inteiro:");
		int segundoNumero = sc.nextInt();

		sc.close();

		int diferença;

		if (primeiroNumero > segundoNumero) {
			diferença = primeiroNumero - segundoNumero;
		} else {
			diferença = segundoNumero - primeiroNumero;
		}

		System.out.println("A diferença do maior pelo menor valor é: " + diferença);
	}

}
