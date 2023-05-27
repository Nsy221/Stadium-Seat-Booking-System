
package stadiumseatbooking;

/**
 *
 * @author Nassya
 */
public class Payment {
    private double amount;
    public double ticketPrice;

    public Payment(double amount) {
        this.amount = amount;
    }
    
    

    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString() {
        return "Amount: $" + getAmount();
    }

}
