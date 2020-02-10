//*******************************************************************

//  Season_Identify
//
// the first number represents the month, the second the day, depending on the date the program will tell you 
// the season ex: (2,9) would output Winter
//By: Morgan Bligh
//Date 2/9/2020
//************
public class Season_Identify {
	static void season(int month, int day) {
	
		int month_day = month * 100 + day;
		if (month_day <= 315) {
		    System.out.println("Winter");
		}
		else if (month_day <= 615) {
		    System.out.println("Spring");
		}
		else if (month_day <= 915) {
		    System.out.println("Summer");
		}
		else if (month_day <= 1215) {
		    System.out.println("Fall");
		}
		else {
		    System.out.println("Winter");
		}
		
	}

	public static void main(String[] args) {
		season(1,1);
		season(5,14);
		season(9,7);
		season(12,1);
		

	}

}
