
public class main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price=10;
		product.name="MOuse";
		
		manager.add(product);
	}

}
