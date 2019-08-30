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
			System.out.println(name);
			//Creates and prints the person's name.
			
			int groc = scan.nextInt();
			System.out.println(groc);
			//counts the number of items they purchased
			double total = 0;
			
				for (int g = 0; g<groc; g++) {
					int count = scan.nextInt();
					String item = scan.next();
					double price = scan.nextDouble();
					double itotal = count * price;
					total = total + itotal;
			}
			String ftotal = String.format("%.2f", total);
			System.out.println(ftotal);
		}
		scan.close();
		System.out.println("Closing...");
		
	}
}
