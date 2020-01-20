public class fibo_seq {

	  public static void main(String[] args) {
	        int n = 12, f1 = 1, k2 = 1;
	        
	        for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(f1 + " ");
	            int sum = f1 + k2;
	            f1 = k2;
	            k2 = sum;
	        }
	    }
	}