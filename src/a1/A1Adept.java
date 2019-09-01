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
		
		for (int i = 0; i < list; i++) {
			shop.put(scan.next(), scan.nextDouble());
		}
		//binds each item to its price
		
		int people = scan.nextInt();
		//gets the number of people
		
		String[] names = new String[people];
		double[] spent = new double[people];
		//creates twin arrays to store the names and totals of each person
		
		for (int i = 0; i < people; i++) {
			String first = scan.next();
			String last = scan.next();
			String name = (first + " " + last);
			names[i] = name;
			//makes a string for the name
			
			int groc = scan.nextInt();
			double total = 0;
			
			for (int g = 0; g<groc; g++) {
				int count = scan.nextInt();
				double price = shop.get(scan.next());
				double itotal = count * price;
				total = total + itotal;
				spent[i] = total;
				//adds all the items together to get total cost
			}
		}
		
		int small = getsmall(spent);
		int big = getbig(spent);
		double avg = getmedium(spent);
		//gets the required info from methods
		
		System.out.println("Biggest: " + names[big] + " (" + String.format("%.2f",spent[big]) + ")");
		System.out.println("Smallest: " + names[small] + " (" + String.format("%.2f",spent[small]) + ")");
		System.out.println("Average: " + String.format("%.2f",avg));
		
		scan.close();
	}
	
	public static int getsmall(double[] monies) {
		double min = monies[0];
		int index = 0;
		for (int i = 1; i < monies.length; i++) {
			if (monies[i] < min) {
				index = i;
			}
		}
		System.out.println(index);
		return index;
		//finds the smallest number and returns its index
	}
	
	public static int getbig(double[] monies) {
		double max = monies[0];
		int index = 0;
		for (int i = 1; i < monies.length; i++) {
			if (monies[i] > max) {
				index = i;
			}
		}
		return index;
		//finds the biggest number and returns its index
	}
	
	public static double getmedium(double[] monies) {
		double c = 0.0;
		for (int i = 0; i < monies.length; i++) {
			c = c + monies[i];
		}
		
		return (c / monies.length);
		//finds the average and returns it
	}
}
