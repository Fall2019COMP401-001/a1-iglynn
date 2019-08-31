package a1;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//sets up scanner
		
		Map<String, Double> shop = new HashMap<>();
		//sets up the hashmap for binding the items to their prices
		
		int list = scan.nextInt();
		//gets the number of items in the shop
		
		for (int p = 0; p < list; p++) {
			shop.put(scan.next(), scan.nextDouble());
		}
		//binds each item to its price
		
		int people = scan.nextInt();
		System.out.println(people);
		
	}
}
