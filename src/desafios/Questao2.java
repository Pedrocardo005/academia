package desafios;

public class Questao2 {
	
	public int desafio(String senha) {
		int caracFaltantes = 0;
		int outrosFaltantes = 0;
		
		if (senha.length() < 6) {
			caracFaltantes = 6 - senha.length();
		}
		
		// Verifica se achou algum número
		if (!contemNumero(senha)) {
			outrosFaltantes++;
		}
		
		if (!contemMinusculo(senha)) {
			outrosFaltantes++;
		}
		
		if (!contemMaiusculo(senha)) {
			outrosFaltantes++;
		}
		
		if (!contemEspeciais(senha)) {
			outrosFaltantes++;
		}
		
		if (caracFaltantes > outrosFaltantes) {
			return caracFaltantes;
		} else if(caracFaltantes == 0 && outrosFaltantes == 0) {
			return 0;
		} else {
			return outrosFaltantes;
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
