package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			//Variables
			String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", " J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
			
			System.out.println("Inserire il tuo nome: ");
			String nome = scanner.nextLine();
			System.out.println("Il nome inserito è: "+ nome);
			
			int counter = 0;
			boolean trovato = false;
			
			for(counter = 0; counter < guestList.length; counter++ ) {
				if(nome.equalsIgnoreCase(guestList[counter])) {
					System.out.println("Trovato");
					
					break;
				} else if(counter == guestList.length -1) {
					System.out.println("Non trovato");
				}
			}
			
			while(trovato == false && counter < guestList.length) {
				if(nome.equalsIgnoreCase(guestList[counter])) {
					trovato = true;
					System.out.println("Trovato");
					
					break;
				} 
				counter++;
			} 
			
			if(trovato == false) {
				System.out.println("Non trovato");
			}
			scanner.close();	
	}
}
