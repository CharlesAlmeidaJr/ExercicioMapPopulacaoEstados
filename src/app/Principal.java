package app;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("Crie um dicionário e relacione os estados e suas populações:");
		Map<String, Integer> populacoes = new LinkedHashMap<>() {{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		}};
	 	for(String estado : populacoes.keySet()) System.out.println(estado + " - " + populacoes.get(estado));
		
		System.out.println("\nSubstitua a população do estado do RN por 3.534.165:");
		populacoes.put("RN", 3534165);
		for(String estado : populacoes.keySet()) System.out.println(estado + " - " + populacoes.get(estado));
		
		System.out.println("\nEstado da PB está no dicionário?: " + populacoes.containsKey("PB"));
		System.out.println("Caso não adicione PB – 4.039.277");
		populacoes.put("PB", 4039277);
		for(String estado : populacoes.keySet()) System.out.println(estado + " - " + populacoes.get(estado));
		
		System.out.println("\nExiba a população de PE: " + populacoes.get("PE"));
		
		System.out.println("\nExiba os estados e suas populações na ordem que foi informado:");
		for(String estado : populacoes.keySet()) System.out.println(estado + " - " + populacoes.get(estado));
		
		System.out.println("\nExiba os estados e suas populações em ordem alfabética:");
		Map<String, Integer> populacoesOrdemAlfabetica = new TreeMap<>(populacoes);
		for(String estado : populacoesOrdemAlfabetica.keySet()) System.out.println(estado + " - " + populacoesOrdemAlfabetica.get(estado));
		
		System.out.println("\nExiba o estado com maior população e sua quantidade:");
		Integer maiorpopulacao = Collections.max(populacoes.values());
		for (String estado : populacoes.keySet()) {
			if(populacoes.get(estado) == maiorpopulacao) {
				System.out.println(estado + " - " + maiorpopulacao);
				break;
			}
		}
		
		Integer soma = 0; 
		for(Integer populacao : populacoes.values()) soma += populacao;
		System.out.println("\nExiba a soma da população desses estados: " + soma);
		
		System.out.println("\nExiba a média da população deste estados: " + soma/populacoes.size());
		
		System.out.println("\nRemova os estados com população menor que 4.000.000:");
		Iterator<Integer> iterator = populacoes.values().iterator();
		while(iterator.hasNext()) {
			if(iterator.next() < 4000000) iterator.remove();
		}
		for(String estado : populacoes.keySet()) System.out.println(estado + " - " + populacoes.get(estado));
		
		System.out.println("\nApague o dicionário de estados");
		populacoes.clear();
		System.out.println("\nConfira se esta vazio: " + populacoes.isEmpty());
		
	}
	
}
