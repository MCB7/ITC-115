//Ticket.java
//Morgan Bligh
//3-15-2019
//This program will  decide depending on the person (student, non-student) and day 
//price of a ticket


import assignment_10.Ticket;

public class TicketMain {
 public static void main (String[] args) {
	 Ticket[] tickets = new Ticket[5];
	 tickets[0] = new Ticket(1);
	 tickets[1] = new AdvanceTicket(2,12);
	 tickets[2] = new AdvanceTicket(3,8);
	 tickets[3] = new StudentAdvanceTicket(4,17);
	 tickets[4] = new StudentAdvanceTicket(5,7);
	 
	 for (int i = 0; i<5; i++) {
		 System.out.println(tickets[i]);
		 
	 }
	 
 }
}
