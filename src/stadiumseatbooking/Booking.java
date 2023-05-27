
package stadiumseatbooking;

/**
 *
 * @author Nassya
 */
public class Booking {
    private Customer customer;
    private Ticket ticket;
    private SeatSelection seatSelection;
    private Payment payment;

    public Booking(Customer customer, Ticket ticket, SeatSelection seatSelection, Payment payment) {
        this.customer = customer;
        this.ticket = ticket;
        this.seatSelection = seatSelection;
        this.payment = payment;
    }

    public void confirmBooking() {
        System.out.println(" ");
        System.out.println("**********Booking confirmed!**********");
        System.out.println(" ");
        System.out.println("Customer: " + customer.toString());
        System.out.println("Ticket: " + ticket.toString());
        System.out.println("Seat Selection: " + seatSelection.toString());
        System.out.println("Payment: " + payment.toString());
    }
}