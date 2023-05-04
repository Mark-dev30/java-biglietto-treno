package org.lessons.java;

public class CibiPreferiti {
	public static void main(String[] args) {
		String[] food = {"Pizza","Lasagna","Gelato","Ramen","Carbonara"};
		System.out.println("Lunghezza Classifica: " + food.length);
		System.out.println("Cibo Preferito: " + food[0]);
		System.out.println("Cibo Preferito Ma Non Troppo: " + food[food.length-1]);
		
		System.out.println("Cibo Centrale: " + food[food.length/2]);
	}
}
