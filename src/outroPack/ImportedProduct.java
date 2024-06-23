package outroPack;

public class ImportedProduct extends Product{
	
	protected Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " + totalPrice() + " (customs Fee: $ " + customsFee + ")";
	}
	public Double totalPrice() {
		return customsFee +  price;
	}
}
