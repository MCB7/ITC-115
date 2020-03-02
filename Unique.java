/*
isUnique.java
Morgan Bligh
3-1-2020
this program will tell if the integer type elements of an array are unique
true if number dont repeat, false if numbers repeat.  
 */
public class Unique {
	public static boolean isUnique(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        int min = array[i];
	        
	        for (int j = i + 1; j < array.length; j++) {
	            if (min > array[j]) {
	                array[i] = array[j];
	                array[j] = min;
	                min = array[i];
	            }
	        }
	        
	    }
	    
	    for (int i = 0; i < array.length - 1; i++) {
	        if (array[i] == array[i + 1]) {
	            return false;
	        }
	    }
	    
	    return true;
	}
public static void main(String[] args) {
  	int[] list1 = {1, 1, 1, 1, 1};
  	int[] list2 = {2, 6, 7, 1, 4};
  	System.out.println(isUnique(list1));
  	System.out.println(isUnique(list2));
}
}
	
