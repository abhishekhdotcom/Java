package Ed_v28_Java_InnerClass.innerclasses;

public class Hotel {
    private String hotelName;
    private int totalRooms;
    private int reservedRooms;

    // -----------Constructor-----------
    public Hotel(String hotelName, int reservedRooms, int totalRooms) {
        this.hotelName = hotelName;
        this.reservedRooms = reservedRooms;
        this.totalRooms = totalRooms;
    }

    // -----------Method-----------
    public void reservedRoom(String guestName, int numOfRooms) {
        // Local Class
        class ReservationValidator {

            // Method
            boolean validate() {
                if (guestName == null || guestName.isBlank()) {
                    System.out.println("Guest Name Can't be Empty!");
                    return false;
                }
                if (numOfRooms < 0) {
                    System.out.println("Number of Rooms should be Positive!");
                    return false;
                }
                if (reservedRooms + numOfRooms > totalRooms) {
                    System.out.println("Not Rooms Available!");
                    return false;
                }
                return true;
            }
        }

        // Create new Obj of ReservationValidator
        ReservationValidator validator = new ReservationValidator();
        if (validator.validate()) {
            reservedRooms += numOfRooms;
            System.out.println("Reservation Confirmed for " + guestName + " for " + numOfRooms + " Rooms!");
        } else {
            System.out.println("Reservation Failed!");
        }
    }

}
