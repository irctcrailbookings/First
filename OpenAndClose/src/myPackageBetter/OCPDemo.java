package myPackageBetter;

import java.util.List;

public class OCPDemo {
	public static void main(String[] args) {
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
		Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
		Product house = new Product("House", Color.BLUE, Size.LARGE);

		List<Product> products = List.of(apple, tree, house);

		// vv AFTER
		BetterFilter bf = new BetterFilter();
		System.out.println("Green products (new):");
		bf.filter(products, new ColorSpecification(Color.GREEN))
				.forEach(p -> System.out.println(" - " + p.name + " is green"));

		
	}
}
