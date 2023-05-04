package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		//Bonus
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int number = in.nextInt();
		for(int i = 1; i <= number; i++) {
			if (i%3 == 0 && i%5 == 0){
		        System.out.println("FizzBuzz");
		    }

		    else if(i%3 == 0){
		    	System.out.println("Fizz");
		        
		    }

		    else if(i%5 == 0){
		    	System.out.println("Buzz");
		        
		    }

		    else {
		    	System.out.println(i);
		    }
		}
		in.close();
	}
}
