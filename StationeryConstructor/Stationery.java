package StationeryConstructor;

import java.util.*;

public class Stationery {
	Scanner sc = new Scanner(System.in);
	
	String brand, color, usage;
	double price;
	
	// create default constructor
	Stationery(){
		System.out.println("Enter the brand: ");
		this.brand = sc.nextLine();
		System.out.println("Enter the color: ");
		this.color = sc.nextLine();
		System.out.println("Enter the usage: ");
		this.usage = sc.nextLine();
		System.out.println("Enter the price: ");
		this.price = sc.nextDouble();
	}
	
	//create parameterized constructor
	Stationery(String b, String c, String u, double p){
		this.brand = b;
		this.color = c;
		this.usage = u;
		this.price = p;
	}
	
}
