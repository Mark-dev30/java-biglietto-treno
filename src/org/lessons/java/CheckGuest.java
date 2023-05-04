package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		String[] listInvited = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome");
		String nameComplete = in.nextLine();
		in.close();
		for(int i = 0; i < listInvited.length; i++) {
			if( nameComplete.equals(listInvited[i])) {
				System.out.println("Complimenti sei nella lista");
				return;
				
			}
			
		}
		System.out.println("Mi dispiace non sei nella lista");
		//Bonus
//		int i = 0;
//		while(i<listInvited.length) {
//			String invited = listInvited[i++];
//			if(nameComplete.equals(invited)){
//				System.out.println("Complimenti sei nella lista");
//				return;
//			}
//		}
//		
//		System.out.println("Mi dispiace non sei nella lista");
	}
}
