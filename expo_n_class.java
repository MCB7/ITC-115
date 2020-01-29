
public class expo_n_class {
	static void printPowersOfN(int base, int exponent) {
	    int currentNum = 1;
	    System.out.print(currentNum + " ");
	    
	    for (int i = 1; i <= exponent; i++) {
	        currentNum *= base;
	        System.out.print(currentNum + " ");
	    }
	    
	    System.out.println();
	}
	public static void main(String[] args) {
		printPowersOfN(2,7);
		printPowersOfN(5,3);
	}
	
	}

