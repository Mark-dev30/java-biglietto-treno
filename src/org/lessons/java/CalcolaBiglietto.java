package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		Double priceKm = 0.21;
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il numero di chilometri da percorrere");
		Integer kilometres = Integer.parseInt(in.nextLine());
		System.out.println("Inserisci la tua età");
		Integer age = Integer.parseInt(in.nextLine());
		Double price = priceKm * kilometres;
		if (age < 18) {
			double discount = price * 20 / 100;
			double finalPrice = price - discount;
			System.out.println("Il totale da pagare è" + finalPrice + '€');
		}
		else if (age >= 65) {
			double discount = price * 40 / 100;
			double finalPrice = price - discount;
			System.out.println("Il totale da pagare è" + finalPrice + '€');
			
		}
		else {
			System.out.println("Il totale da pagare è " + price + '€');
		}
		
		in.close();
	}
}