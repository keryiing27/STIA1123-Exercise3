package AccessoriesConstructor;

import java.util.*;

public class Accessories {
	Scanner sc = new Scanner(System.in);
	
	String brand, color,material;
	double price, size, weight;
	
	// create default constructor
	Accessories(){
		System.out.println("Enter the brand: ");
		this.brand = sc.nextLine();
		System.out.println("Enter the color: ");
		this.color = sc.nextLine();
		System.out.println("Enter the material: ");
		this.material = sc.nextLine();
		System.out.println("Enter the size: ");
		this.size = sc.nextDouble();
		System.out.println("Enter the weight: ");
		this.weight = sc.nextDouble();
		System.out.println("Enter the price: ");
		this.price = sc.nextDouble();
	}
	
	//create parameterized constructor
	Accessories(String b, String c, double s, String m, double w, double p){
		this.brand = b;
		this.color = c;
		this.size = s;
		this.material = m;
		this.weight = w;
		this.price = p;
	}
	
}
