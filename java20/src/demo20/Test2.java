package demo20;

import java.util.ArrayList;
import java.util.function.BiPredicate;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(new Product(101, 6, 20, 10));
		list.add(new Product(103, 5, 70, 78));
		list.add(new Product(102, 3, 54, 34));
		list.add(new Product(104, 6, 21, 13));
		BiPredicate<Integer, Integer> bp1 = (lase, socks) -> ((lase + socks) >= 50);
		BiPredicate<Integer, Integer> bp2 = (lase, socks) -> ((lase + socks) <= 50);
		for (Product p : list) {
			if (bp1.test(p.laseprice, p.shocksprice)) {
				System.out.println(p.size + " " + p.laseprice + " " + p.shocksprice);
				System.out.println("Costly");
				System.out.println(" ");
			} else if (bp2.test(p.laseprice, p.shocksprice)) {
				System.out.println(p.size + " " + p.laseprice + " " + p.shocksprice);
				System.out.println("Cheep");
				System.out.println(" ");
			}
		}
		for (Product p1 : list) {
			if (((p1.size) >= 5) && ((p1.laseprice + p1.shocksprice) <= 50)) {
			    System.out.println(p1.size + " " + p1.laseprice + " " + p1.shocksprice);
			    System.out.println("Best product");
			    System.out.println(" ");
		}
	}
}
}

class Product {
	int id;
	int size;
	int laseprice;
	int shocksprice;

	public Product(int id, int size, int laseprice, int shocksprice) {
		super();
		this.id = id;
		this.size = size;
		this.laseprice = laseprice;
		this.shocksprice = shocksprice;
	}
}
