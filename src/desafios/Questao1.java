package desafios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {
	public void desafio () {
		boolean digitado = false;
		
		while(!digitado) {
			int n = 0;
			Scanner ler = new Scanner(System.in);

			try {
				System.out.print("Digite o número de vezes: ");
				n = ler.nextInt();
				ler.close();
				String estrelas = "";
				
				for (int i = n; i > 0; i--) {
					String espacos = "";
					for (int j = 1; j < i; j++) {
						espacos += " ";
					}
					estrelas += "*";
					System.out.println(espacos + estrelas);
				}
				digitado = true;
			} catch (InputMismatchException e) {
				System.out.println("Digito não corresponde a um número!");
			} catch (Exception e) {
				System.out.println("Deu algum erro!");
			}
		}
	}
}
