


public class writeNums {
	public static void writeNumbers(int n) {
	    if (n < 1) {
	        throw new IllegalArgumentException();
	    } else if (n == 1) {
	        System.out.print("1");
	    } else {
	        writeNumbers(n - 1);
	        System.out.print(", " + n);
	    }
	}

public static void main(String[] args) {
	writeNumbers(5);
	System.out.println("       ");
	writeNumbers(12);
}
}

	
