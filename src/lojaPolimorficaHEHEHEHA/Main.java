package lojaPolimorficaHEHEHEHA;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import outroPack.ImportedProduct;
import outroPack.Product;
import outroPack.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int quantityProd = sc.nextInt();
		
		Product product = null;
		for(int n = 0; n < quantityProd; n++) {
			System.out.println("Product #" + (n+1) + " data: ");
			System.out.print("Common, used or imported (c/u/i): ");
			String situation = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			
			if(situation.equals("c")) {
				product = new Product(name, price);
			}else if(situation.equals("u")){
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String date = sc.nextLine();
				product = new UsedProduct(name, price, sdf.parse(date));
			}
			else {
				System.out.print("Customs Fee: ");
				Double customsFee = sc.nextDouble();
				product = new ImportedProduct(name, price, customsFee);
			}
			product.addProduct(product);
		}
		sc.close();
		System.out.print("PRICE TAGS: ");
		for (Product p : Product.Products()) {
            System.out.println(p.priceTag());
        }

	}

}
