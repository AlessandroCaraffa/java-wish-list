package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<String> listaRegali;
		listaRegali = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		boolean continuare = false;
		while(!continuare) {
			System.out.print("Aggiungi elemento alla lista dei desideri: ");
			String regalo = scan.nextLine();
			listaRegali.add(regalo);
			
			boolean rispostoContinuare1 = false;
			while (!rispostoContinuare1) {
			System.out.println("La tua lista è contiene " + listaRegali.size() + " desideri.\nContinuare? (s/n)");
				String rispostaContinuare = scan.nextLine();
				if (rispostaContinuare.equals("n")) {
					continuare = false;
					rispostoContinuare1= true;
				} else if (rispostaContinuare.equals("s")) {
					continuare = true;
					rispostoContinuare1 = true;
				} else {
					rispostoContinuare1 = false;
				} 
			}
		}
		scan.close();
		System.out.println("Ecco la tua lista :");
		for(String s : listaRegali) {
		System.out.println(s);
	}

	

	}

}
