
package stadiumseatbooking;

/**
 *
 * @author Nassya
 */
public class EventBooking extends Booking {
    private String eventDate;
    
    public EventBooking(Customer customer, Ticket ticket, SeatSelection seatSelection, Payment payment, String eventDate) {
        super(customer, ticket, seatSelection, payment);
        this.eventDate = eventDate;
    }
    
    public String getEventDate() {
        return eventDate;
    }

    
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }
    
      @Override
    public void confirmBooking() {
        super.confirmBooking();
        System.out.println("Event Date: " + getEventDate());
    }
}
