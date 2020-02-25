import java.util.Random;


public class AntCrawl {
 public static void main(String args[])
 {
	 Random steps = new Random();
	 int height = 0;
	 int falls = 0;
	 while (height<6) {
		 int rand = steps.nextInt(2);
		 if (rand == 0) {
			 height = 0;
		 	 falls++;
		 	 }
	
		else {
		 height++;
	 }
	 }
	 System.out.println("number of falls:" + falls);
	 }

     }

