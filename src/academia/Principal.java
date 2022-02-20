package academia;

import java.util.InputMismatchException;
import java.util.Scanner;

import desafios.Questao1;
import desafios.Questao2;
import desafios.Questao3;

public class Principal {

	public static void main(String[] args) {
		Questao1 questao1 = new Questao1();
		Questao2 questao2 = new Questao2();
		Questao3 questao3 = new Questao3();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a questao que deseja (1, 2 ou 3): ");
		try {
			int op = scanner.nextInt();
			switch (op) {
			case 1:
				questao1.desafio();
				break;
			case 2:
				questao2.desafio();
				break;
			case 3:
				questao3.desafio();
			default:
				System.out.println("Opção inválida.");
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("Opção inválida");
		}
	}

}
