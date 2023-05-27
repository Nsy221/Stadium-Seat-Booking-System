package stadiumseatbooking;

/**
 *
 * @author Nassya
 */
import java.util.Scanner;

public class StadiumSeatBooking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Stadium Seat Booking System");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer email: ");
        String customerEmail = scanner.nextLine();
        Customer customer = new Customer(customerName, customerEmail);

        System.out.print("Enter ticket number: ");
        int ticketNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter event name: ");
        String eventName = scanner.nextLine();
        Ticket ticket = new Ticket(ticketNumber, eventName);

        SeatSelection seatSelection = new SeatSelection();

      
        System.out.print("Enter the number of seats: ");
        int numOfSeats = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numOfSeats; i++) {
            System.out.print("Enter the seat type (EXECUTIVE, PREMIUM, CLUB) for seat " + (i + 1) + ": ");
            String seatTypeInput = scanner.nextLine();

            SeatType seatType = null;
            if (seatTypeInput.equals("EXECUTIVE")) {
                seatType = SeatType.EXECUTIVE;
            } else if (seatTypeInput.equals("PREMIUM")) {
                seatType = (SeatType) SeatType.PREMIUM;
            } else if (seatTypeInput.equals("CLUB")) {
                seatType = (SeatType) SeatType.CLUB;
            } else {
                System.out.println("Invalid seat type entered.");
                i--; 
                continue;
            }

            seatSelection.addSeat(seatType);
        }

        double totalPrice = seatSelection.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);

   

        System.out.print("Enter payment amount: ");
        double paymentAmount = scanner.nextDouble();
        Payment payment = new Payment(paymentAmount);

        Booking booking = new Booking(customer, ticket, seatSelection, payment);
        booking.confirmBooking();

//        EventBooking eventBooking = new EventBooking(customer, ticket, seatSelection, payment, eventDate);
//        eventBooking.confirmBooking();
        scanner.close();
    }
}
