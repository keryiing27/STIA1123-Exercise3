package StationeryConstructor;

public class Main {

	public static void main(String[] args) {
	
		Stationery pen = new Stationery();
		System.out.println("PEN PROPERTIES");
		System.out.printf("Brand: %s%nColor: %s%nUsage: %s%nPrice: RM %.2f", pen.brand, pen.color, pen.usage, pen.price);
		System.out.println();
		System.out.println("-------------------------");
		
		Stationery scissors = new Stationery();
		System.out.println("SCISSORS PROPERTIES");
		System.out.printf("Brand: %s%nColor: %s%nUsage: %s%nPrice: RM %.2f", scissors.brand, scissors.color, scissors.usage, scissors.price);
		System.out.println();
		System.out.println("-------------------------");
		
		Stationery highlighter = new Stationery("STABILO", "Purple", "Highlight", 3.90);
		System.out.println("HIGHLIGHTER PROPERTIES");
		System.out.printf("Brand: %s%nColor: %s%nUsage: %s%nPrice: RM %.2f", highlighter.brand, highlighter.color, highlighter.usage, highlighter.price);
		System.out.println();
		System.out.println("-------------------------");
		
		Stationery ruler = new Stationery(null,"Transparent","Measuring", 1.10);
		System.out.println("RULER PROPERTIES");
		System.out.printf("Brand: %s%nColor: %s%nUsage: %s%nPrice: RM %.2f", ruler.brand, ruler.color, ruler.usage, ruler.price);
		System.out.println();
		System.out.println("-------------------------");

	}

}
