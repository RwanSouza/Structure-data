package com.rwan.estruturadados.vetor.teste;

import com.rwan.estruturadados.vetor.Vetor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vetor vetor = new Vetor(15);

		try {
			vetor.adiciona("Elemento 1");
			vetor.adiciona("Elemento 2");
			vetor.adiciona("Elemento 3");
			vetor.adiciona("Elemento 3");
			vetor.adiciona("Elemento 3");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
