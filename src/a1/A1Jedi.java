package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int items = scan.nextInt();
		String[] shop = new String[items];
		//sets up the array for names
		int[] bought = new int[items];
		//sets up the counter for number bought
		int[] customer = new int[items];
		//sets up the counter for customers
		
		for (int i = 0; i < shop.length; i++) {
			shop[i] = scan.next();
			double price = scan.nextDouble();
		}
		//fills the array with each item and disposes of the unneeded price
		
		int people = scan.nextInt();
		
		for (int i = 0; i < people; i++) {
			String name = scan.next() + scan.next();
			//gets rid of the useless name
			
			int purchase = scan.nextInt();
			
			for (int g = 0; g < purchase; g++) {
				int num = scan.nextInt();
				String item = scan.next();
				int dex = arrayScan(shop, item);
				bought[dex] = bought[dex] + num;
				customer[dex] = customer[dex] + 1;
			}
			
		}
		
		for (int i = 0; i < shop.length; i++) {
			
			if (customer[i] == 0) {
				System.out.println("No customers bought " + shop[i]);
			} else
			System.out.println(customer[i] + " customers bought " + bought[i] + " " + shop[i]);
		}
		scan.close();
	}
	
	public static int arrayScan (String[] shop, String item) {
		
		for (int i = 0; i < shop.length; i++) {
			if (item.equals(shop[i])) {
				return i;
			}
		} return 0;
	}
}
