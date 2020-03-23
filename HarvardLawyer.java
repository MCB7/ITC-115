//HarvadLawyer.java
//Morgan Bligh
//3-22-2020
//This program will determind the salary, vactions day, and form for Havard Lawyer
public class HarvardLawyer extends Lawyer {
    public double getSalary() {
        return 1.2 * super.getSalary();
    }
    
    public int getVacationDays() {
        return super.getVacationdays() + 3;
    }
    
    public String getVacationForm() {
        String form = super.getVacationForm();
        return form + form + form + form;
    }
}