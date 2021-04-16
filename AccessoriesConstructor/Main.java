package AccessoriesConstructor;

public class Main {

	public static void main(String[] args) {
	
		Accessories watch = new Accessories();
		System.out.println("WATCH PROPERTIES");
		System.out.printf("Brand: %s%nColor: %s%nMaterial: %s%nSize: %.2f%nWeight: %.2fgm%nPrice: RM %.2f", watch.brand, watch.color,  watch.material, watch.size, watch.weight, watch.price);
		System.out.println();
		System.out.println("-------------------------");
		
		Accessories sunglasses = new Accessories();
		System.out.println("SUNGLASSES PROPERTIES");
		System.out.printf("Brand: %s%nColor: %s%nMaterial: %s%nSize: %.2f%nWeight: %.2fgm%nPrice: RM %.2f", sunglasses.brand, sunglasses.color, sunglasses.material, sunglasses.size, sunglasses.weight, sunglasses.price);
		System.out.println();
		System.out.println("-------------------------");
		
		Accessories ring = new Accessories("Lazo Diamond", "Silver", 12.0, "White Gold & Diamond", 1.34, 649.99);
		System.out.println("RING PROPERTIES");
		System.out.printf("Brand: %s%nColor: %s%nMaterial: %s%nSize: %s%nWeight: %.2fgm%nPrice: RM %.2f", ring.brand, ring.color, ring.material, ring.size, ring.weight, ring.price);
		System.out.println();
		System.out.println("-------------------------");
		
		Accessories necklace = new Accessories("POH KONG","Gold", 0.0, "Gold", 1.35, 519.99);
		System.out.println("NECKLACE PROPERTIES");
		System.out.printf("Brand: %s%nColor: %s%nMaterial: %s%nSize: %s%nWeight: %.2fgm%nPrice: RM %.2f", necklace.brand, necklace.color, necklace.material, necklace.size, necklace.weight, necklace.price);
		System.out.println();
		System.out.println("-------------------------");

	}

}
