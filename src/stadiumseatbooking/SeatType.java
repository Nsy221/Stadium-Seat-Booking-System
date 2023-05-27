
package stadiumseatbooking;

/**
 *
 * @author Nassya
 */
public class SeatType {

    static SeatType EXECUTIVE;

//    enum SeatType {
//        EXECUTIVE(100.0),
//        PREMIUM(75.0),
//        CLUB(50.0);
//
//        private double price;
//
//        SeatType(double price) {
//            this.price = price;
//        }
//
//        public double getPrice() {
//            return price;
//        }
//    }
    static Object PREMIUM;
    static Object CLUB;



    private String type;
 
    public SeatType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
      @Override
    public String toString() {
        return getType();
    }
}