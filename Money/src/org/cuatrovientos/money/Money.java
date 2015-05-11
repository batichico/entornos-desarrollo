/**
 * 
 */
package org.cuatrovientos.money;

import java.util.Scanner;

/**
 * @author Egoitz
 *
 */
public class Money {

	
	public static void main(String[] args) {
	
		float number = 0f;
		String money = "";
		Scanner reader = new Scanner(System.in);
		String line = "";
		
		System.out.println("Enter money in euros: ");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		
		System.out.println("Enter a monetary unity (d ,y ,l) : ");
		money = reader.nextLine();
		
		switch (money) {
			
			case "d":
					
				System.out.println("In dolars is " +(number * 1.27f) );					
				break;	
					
			case "y":
				
				System.out.println("In yens is " +(number * 135.89f) );
				break;
				
			case "l":
				
				System.out.println("In pounds is " +(number * 0.80f) );
				break;
			
			default:
				
				break;
		}
	}

}
