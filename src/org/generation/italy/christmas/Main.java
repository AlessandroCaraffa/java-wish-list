package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//creo lista
		ArrayList<String> listaRegali;
		listaRegali = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		boolean continuare = true;
		
		//aggiunta elementi
		while (continuare) {
			System.out.print("Aggiungi elemento alla lista dei desideri: ");
			String regalo = scan.nextLine();
			listaRegali.add(regalo);
			
			
			//verifica se continuare o meno
			boolean nonRispostoContinuare = true;
			while (nonRispostoContinuare) {
			System.out.println("La tua lista è contiene " + listaRegali.size() + " desideri\nContinuare? (s/n)");
				String risposta = scan.nextLine();
				
				if (risposta.toLowerCase().equals("s")) {
					nonRispostoContinuare = false;
				} else if (risposta.toLowerCase().equals("n")) {
					continuare = false;
					nonRispostoContinuare = false;
				} 
			}
		}
		//stampa elementi
		scan.close();
		System.out.println("Ecco la tua lista:");
			
		for (String s : listaRegali) {
			System.out.println(s);
		}
		

	}

}
