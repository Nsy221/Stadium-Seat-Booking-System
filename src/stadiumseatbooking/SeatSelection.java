package stadiumseatbooking;

/**
 *
 * @author Nassya
 */
import java.util.ArrayList;
import java.util.List;



public class SeatSelection {
    private SeatType[] selectedSeats;
    private int count;
    private int numOfSeats;

    public SeatSelection() {
        selectedSeats = new SeatType[10];
        count = 0;
    }

    public void addSeat(SeatType seat) {
        if (getCount() < getSelectedSeats().length) {
            getSelectedSeats()[getCount()] = seat;
            setCount(getCount() + 1);
        } else {
            System.out.println("No more seats can be added.");
        }
    }

    public void removeSeat(SeatType seat) {
        for (int i = 0; i < getCount(); i++) {
            if (getSelectedSeats()[i].equals(seat)) {
                for (int j = i; j < getCount() - 1; j++) {
                    getSelectedSeats()[j] = getSelectedSeats()[j + 1];
                }
                getSelectedSeats()[getCount() - 1] = null;
                setCount(getCount() - 1);
                System.out.println("Seat removed: " + seat.toString());
                return;
            }
        }
        System.out.println("Seat not found: " + seat.toString());
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < getNumOfSeats(); i++) {
            if (getSelectedSeats()[i].equals(SeatType.EXECUTIVE)) {
                totalPrice += 100.0;
            } else if (getSelectedSeats()[i].equals(SeatType.PREMIUM)) {
                totalPrice += 75.0;
            } else if (getSelectedSeats()[i].equals(SeatType.CLUB)) {
                totalPrice += 50.0;
            }
        }
        return totalPrice;
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Selected Seats: ");
        for (int i = 0; i < getCount(); i++) {
            sb.append(getSelectedSeats()[i].toString()).append(", ");
        }
        return sb.toString();
    }

    
    public SeatType[] getSelectedSeats() {
        return selectedSeats;
    }

    
    public int getCount() {
        return count;
    }

  
    public int getNumOfSeats() {
        return numOfSeats;
    }

//    public double getTotalPrice(){
//        return totalPrice;
//    }    
    
    public void setSelectedSeats(SeatType[] selectedSeats) {
        this.selectedSeats = selectedSeats;
    }

   
    public void setCount(int count) {
        this.count = count;
    }

    
    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
}

