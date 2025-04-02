package Hotel_Mangement;
public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Raghus Resto", 4);

        hotel.addRoom(new LuxaryRoom(1, 200, true, true));
        hotel.addRoom(new DeluxeRoom(2, 500, true, true));
        hotel.addRoom(new LuxaryRoom(3, 200, true, false));
        hotel.addRoom(new DeluxeRoom(4, 500, true, false));

        hotel.displayAvailableRooms();

       Customer c1 = new Customer("Pavan", "8208193860");
       Customer c2 = new Customer("Siddu", "8198203860");

       hotel.bookRoom(1, c1);
       hotel.bookRoom(2, c2);

       hotel.displayBookedRoom();
       hotel.displayAvailableRooms();
    }
}
