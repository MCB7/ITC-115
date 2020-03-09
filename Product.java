import java.text.NumberFormat;

public class Product {
 private String code;
 private String count;
 private String description;
 private double price;

 public Product(String codeProduct, String countProduct, String descriptionProduct,double d) {
	 code = codeProduct;
	 count = countProduct;
	 description = descriptionProduct;
	 price = d;
 }
 public String getCode() {
	 return code;
 }

public String getCount() {
	return count;
}

public String getDescription() {
	return description;
}

public double getPrice() {
	return price;
}
public String getPriceFormatted() 
{
    String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
    return formattedPrice;
}

public String toString() {
	return String.format("Code: %s Count: %s Description: %s Price: %s ", getCode(), getCount(), getDescription(), getPriceFormatted());

}

}



