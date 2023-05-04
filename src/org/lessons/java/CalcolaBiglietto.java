package org.lessons.java;
//import scanner for keyboard inputs
import java.util.Scanner;
//import decimalformat for rounded number
import java.text.DecimalFormat;
// class calculates the ticket price 
public class CalcolaBiglietto {
	public static void main(String[] args) {
		//price for one km
		Double priceKm = 0.21;
		
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		//print message
		System.out.println("Inserisci il numero di chilometri da percorrere");
		//create the kilometres variable to which I assign the input value
		int kilometres = in.nextInt();
		//print message
		System.out.println("Inserisci la tua età");
		//create the age variable to which I assign the input value
		Integer age = in.nextInt();
		//create the variable price to which I assign the value from the multiplication of priceKm * kilometres
		Double price = priceKm * kilometres;
		//condition if age < 18
		if (age < 18) {
			//create the variable discount to which I assign the rate
			double discount = price * 20 / 100;
			double finalPrice = price - discount;
			System.out.println("Il totale da pagare è " + df.format(finalPrice) + '€');
		}
		//condition if age >= 65
		else if (age > 65) {
			//create the variable discount to which I assign the rate
			double discount = price * 40 / 100;
			double finalPrice = price - discount;
			System.out.println("Il totale da pagare è " + df.format(finalPrice) + '€');
			
		}
		//else
		else {
			System.out.println("Il totale da pagare è " + price + '€');
		}
		
		in.close();
	}
}
