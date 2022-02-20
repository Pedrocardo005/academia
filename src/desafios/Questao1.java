package desafios;

public class Questao1 {
	public String desafio (int n) {
		
		String estrelas = "";
		String retorno = "";
		
		for (int i = n; i > 0; i--) {
			String espacos = "";
			for (int j = 1; j < i; j++) {
				espacos += " ";
			}
			estrelas += "*";
			retorno += espacos + estrelas + "\n";
		}
		
		return retorno;
	}
}
