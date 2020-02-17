//*******************************************************************

//  Girlboy

// list number of boys and girls names (boy then girl ex: bill jane frank susan pattern) in provided text file 
//while also adding the attached number to name and finding the difference of the sums 
//(boys = 27 girls = 32 therefore difference is 5)
//By: Morgan Bligh
//Date: 2-16-2020
//*******************************************************************


import java.io.*;
import java.util.*;

public class Girlboy{
    public static void main (String[] args) throws FileNotFoundException{
        File f = new File("boysgirls.txt");
        Scanner input = new Scanner(f);
        boyGirl(input);
    }
    
    public static void boyGirl(Scanner inp){
        int boysTotal = 0;
        int boysNumTotal = 0;
        int girlsTotal = 0;
        int girlsNumTotal = 0;
        int count = 0;
        while (inp.hasNext()){
            if (count % 2 == 0){
                boysTotal++;
                boysNumTotal += readNameNumber(inp);
            } else {
                girlsTotal++;
                girlsNumTotal += readNameNumber(inp);
            }
            count += 1;
        }
        System.out.println(boysTotal + " boys, " + girlsTotal + "girls");
        System.out.println("Difference between boys' and girls' sums: " + Math.abs(boysNumTotal - girlsNumTotal));
    }
    
    public static int readNameNumber(Scanner inp){
        String name = inp.next();
        int    num = inp.nextInt();
        
        return num;
    }
}