//Ticket.java
//Morgan Bligh
//3-15-2019
//This program will  decide depending on the person (student, non-student) and day 
//price of a ticket

public class StudentAdvanceTicket extends AdvanceTicket {

  public StudentAdvanceTicket(int number, int daysAhead) {
    super(number, daysAhead);}
    public double getPrice() {
    	return super.getPrice()/2;
    }

  public String toString() {
    return super.toString() + " (ID Required) ";
  }
}