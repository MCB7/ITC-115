//HarvadLawyer.java
//Morgan Bligh
//3-22-2020
//This program will determind the hours, salary, vaction days, and statment for Janitor 
public class Janitor extends Employee {
    public int getHours() {
        return 2 * super.getHours();
    }
    
    public double getSalary() {
        return super.getSalary() - 10000;
    }
    
    public int getVacationDays() {
        return super.getVacationdays() / 2;
    }
    
    public void clean() {
        System.out.println("Workin' for the man.");
    }
}
