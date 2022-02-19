package desafios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Questao3 {
	public void desafio() {
		String s = "";
		Scanner ler = new Scanner(System.in);
        HashMap<String, Integer> map= new HashMap<>();
  
        System.out.print("Digite a palavra: ");
        s = ler.next();
        
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char[] valC = s.substring(i, j+1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                if (map.containsKey(val)) 
                    map.put(val, map.get(val)+1);
                else 
                    map.put(val, 1);
            }
        }
        int anagramPairCount = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            anagramPairCount += (n * (n-1))/2;
        }
        System.out.println(anagramPairCount);
	}
}
