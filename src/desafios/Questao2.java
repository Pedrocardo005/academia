package desafios;

import java.util.Scanner;

public class Questao2 {
	
	public void desafio() {
		boolean senhaForte = false;

		while (!senhaForte) {
			Scanner ler = new Scanner(System.in);
			String senha = "";
			
			System.out.print("Digite uma palavra: ");
			try {
				senha = ler.next();
				if (senha.length() < 6) {
					int valor = 6 - senha.length();
					System.out.println("Digite mais "+valor+" caracteres");
					break;
				}
				
				// Verifica se achou algum número
				if (!contemNumero(senha)) {
					System.out.println("Digite ao menos um número");
					break;
				}
				
				if (!contemMinusculo(senha)) {
					System.out.println("Digite ao menos uma letra minúscula");
					break;
				}
				
				if (!contemMaiusculo(senha)) {
					System.out.println("Digite uma letra maiúscula");
					break;
				}
				
				if (!contemEspeciais(senha)) {
					System.out.println("Digite ao menos um caractere especial");
					break;
				}
				
				senhaForte = true;
//				ler.close();
			} catch (Exception e) {
				System.out.println("Houve algum erro");
			}
		}	
	}
	
	private boolean contemNumero(String senha) {
		String numeros = "0123456789";
		// Busca por algum número
		for (int i = 0; i < senha.length(); i++) {
			for (int j = 0; j < numeros.length(); j++) {
				if(senha.charAt(i) == numeros.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean contemMinusculo (String senha) {
		for (int i = 0; i < senha.length(); i++) {
			if (Character.isLowerCase(senha.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	private boolean contemMaiusculo (String senha) {
		for (int i = 0; i < senha.length(); i++) {
			if (Character.isUpperCase(senha.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	private boolean contemEspeciais (String senha) {
		String especiais = "!@#$%^&*()-+";
		
		for (int i = 0; i < senha.length(); i++) {
			for (int j = 0; j < especiais.length(); j++) {
				if (senha.charAt(i) == especiais.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
}
