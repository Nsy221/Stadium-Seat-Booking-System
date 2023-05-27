
package stadiumseatbooking;

/**
 *
 * @author Nassya
 */
public class SeatType extends SeatSelection {

    static SeatType EXECUTIVE;
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