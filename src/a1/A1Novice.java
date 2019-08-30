package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		
		//Counts the number of people and puts them in an array.
		
		for (int i = 0; i<number; i++) {
			String first = scan.next();
			String last = scan.next();
			String name = (first.charAt(0) + ". " + last);
			//Creates the name
			
			int groc = scan.nextInt();
			//counts the number of items they purchased
			double total = 0;
			//sets the starting total at 0
			
				for (int g = 0; g<groc; g++) {
					int count = scan.nextInt();
					String item = scan.next();
					//puts the item name somewhere, despite it being irrelevant
					double price = scan.nextDouble();
					double itotal = count * price;
					total = total + itotal;
					//adds the total of each item together
			}
			String ftotal = String.format("%.2f", total);
			//formats the double
			System.out.println(name + ": " + ftotal);
			//prints the name and total
		}
		scan.close();
		//closes the scanner
		
	}
}
