package outroPack;

import java.util.ArrayList;

public class Product {
	
	protected String name;
	protected Double price;
	private static ArrayList<Product> products = new ArrayList<Product>();
	
	//contrutores
	public Product() {
	}
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}

	
	public String priceTag() {
		return name + " $ " + price;
	}
	
	//metodos para ArrayList
	public void addProduct(Product Product) {
		products.add(Product);
	}
	public Product verProduct(int positions) {
		return products.get(positions);
	}
	public static ArrayList<Product> Products(){
		return products;
	}
	
}
