
public class Create_Products {
	public static void main(String[] args){
		Product product1 =  new Product("12345", "1", "Round", 12.99);
		Product product2 =  new Product("2468", "2", "Oval", 30.79);
		Product product3 =  new Product("1357", "3", "Flat", 1.24);
		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);
	}
	
}
