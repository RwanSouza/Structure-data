package com.rwan.estruturadados.vetor.teste;

import com.rwan.estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("Elemento 1");
		vetor.adiciona("Elemento 2");
		vetor.adiciona("Elemento 3");
		
		System.out.println(vetor.tamanho());
		System.out.println(vetor);
	}

}
