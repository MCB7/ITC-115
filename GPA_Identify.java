//*******************************************************************

//  printGPA
//
// User inputs name (ex:Maria), # of scores (ex:5), and score (0-100)
// the program will then output the user's Name and average score (ex:Maria's grade is 82.8)
//By: Morgan Bligh
//Date 2/9/2020
//************


	import java.util.Scanner;  
	public class GPA_Identify {
	  public static void main(String[] args) {
	    Scanner printGPA = new Scanner(System.in);
	    System.out.println("Enter a student record: ");

	   

	    
	    String name =printGPA.nextLine();

	   
	    int numofgrade = printGPA.nextInt();
	    int grade1 = printGPA.nextInt();
	    int grade2 = printGPA.nextInt();
	    int grade3 = printGPA.nextInt();
	    int grade4 = printGPA.nextInt();
	    int grade5 = printGPA.nextInt();
	    double avg = ((double)grade1 + grade2 + grade3 + grade4 + grade5)/numofgrade;
	    
	    
	    
	    
	    System.out.println( name+"'s grade is: " + avg); 
	   
	}
	}