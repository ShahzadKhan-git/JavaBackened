package innerClasses;

public class Hotel {
    private String hotelName;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String hotelName, int totalRooms, int reservedRooms){
        this.hotelName = hotelName;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms){

        //Local Inner Class
        class reservationValidator{
            boolean validate() {
                if (guestName == null || guestName.isBlank()) {
                    System.out.println("Guest name can't be empty");
                    return false;
                }
                if (numOfRooms < 0) {
                    System.out.println("No. of Rooms should be positive");
                    return false;
                }
                if(reservedRooms + numOfRooms > totalRooms){
                    System.out.println("Not enough rooms are available ");
                    return false;
                }
                return true;
            }
        }

        reservationValidator rv = new reservationValidator();
        if(rv.validate()){
            reservedRooms += numOfRooms;
            System.out.println("Reservation confirmed for " + guestName + " for " + numOfRooms);
        }
        else{
            System.out.println("Reservation Failed");
        }
    }
}
