
package stadiumseatbooking;

/**
 *
 * @author Nassya
 */
public class Ticket {
    private int ticketNumber;
    private String eventName;

    public Ticket(int ticketNumber, String eventName) {
        this.ticketNumber = ticketNumber;
        this.eventName = eventName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

  
    public String getEventName() {
        return eventName;
    }

    
    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    
    @Override
    public String toString() {
        return "Ticket Number: " + getTicketNumber() + ", Event Name: " + getEventName();
    }
}