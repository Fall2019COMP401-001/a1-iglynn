package a1;

import java.util.Scanner;
import java.util.ArrayList;

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
			ArrayList<String> done = new ArrayList<>();
			//creates an arraylist to prevent double purchases
			
			for (int g = 0; g < purchase; g++) {
				int num = scan.nextInt();
				String item = scan.next();
				//gets the number of items purchased
				
				int dex = arrayScan(shop, item);
				bought[dex] = bought[dex] + num;
				//increases the purchase count
				
				if (!done.contains(item)) {
					customer[dex] = customer[dex] + 1;
				}
				//makes sure the customer number only increases if the item has not been bought before
				
				
				if (!done.contains(item)) {
					done.add(item);
				}
				//adds the item to the arraylist to prevent double counting
			}
			
		}
		
		for (int i = 0; i < shop.length; i++) {
			
			if (customer[i] == 0) {
				System.out.println("No customers bought " + shop[i]);
			} else
			System.out.println(customer[i] + " customers bought " + bought[i] + " " + shop[i]);
		}
			//prints out results, and changes 0 to no if no one bought an item
		scan.close();
	}
	
	public static int arrayScan (String[] shop, String item) {
		
		for (int i = 0; i < shop.length; i++) {
			if (item.equals(shop[i])) {
				return i;
			} 				//scans the string array and compares it to the item to find its index number
		} return 0;
	}
}
