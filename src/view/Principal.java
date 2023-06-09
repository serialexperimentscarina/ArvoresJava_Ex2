package view;

import br.com.serialexperimentscarina.arvoreint.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {33, 15, 41, 38, 47, 34, 49, 43};
		ArvoreInt arvore = new ArvoreInt();
		
		for (int valor : vetor) {
			arvore.insert(valor);
		}
		
		try {
			arvore.prefixSearch();
			System.out.println('\n');
			arvore.infixSearch();
			System.out.println('\n');
			arvore.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
