/*
isSorted.java
Morgan Bligh
3-1-2020
this program will tell if the integer type elements of an array are sorted from least greatest
true if (1,2,3) false if (2,1,3)
 */
public class isSorted {
	  public static boolean Sorted(int[] a) {
		  for (int i = 0; i < a.length - 1; i++) {
			  if (a[i] > a[i + 1]) {
				  return false;
			  }
			  
		  }
		    
		    return true;
		    
		    }
	  public static void main(String[] args) {
	  	int[] list1 = {1, 2, 3, 4, 5};
	  	int[] list2 = {2, 6, 7, 1, 4};
	  	System.out.println(Sorted(list1));
	  	System.out.println(Sorted(list2));
}
}