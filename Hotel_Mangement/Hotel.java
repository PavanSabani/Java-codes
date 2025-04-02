package Hotel_Mangement;
class Hotel {
    private String hotelName;
    public Room[] rooms;
    private int roomCount;
    int size;

    public Hotel(String hotelName, int size) {
        this.hotelName = hotelName;
        rooms = new Room[size];
        roomCount=0;
    }
    
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void addRoom(Room r){
        if(roomCount<rooms.length){
            rooms[roomCount]=r;
            roomCount++;
            System.out.println("Room Added :"+r.getRoomNumber());
        }else{
            System.out.println("Cannot add more Rooms....");
        }
    }

    public void displayAvailableRooms(){
        System.out.println("\n Availabel Rooms:");
        for(Room r:rooms){
            if(r.isAvailability()==true){
                System.out.println(r);
            }
        }
        System.out.println();
    }
    public void bookRoom(int roomNumber, Customer c) {
        boolean flag = false;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getRoomNumber() == roomNumber) {
                flag = true;
                if (rooms[i].isAvailability()) {
                    rooms[i].setAvailability(false);
                    rooms[i].setCustomer(c);
                    System.out.println("Room No:"+roomNumber+" booked for: " + c.getName());
                    return; 
                } else {
                    System.out.println("Room No :"+roomNumber+" not available");
                    return;
                }
            }
        }
        if (!flag) {
            System.out.println("Room No: " + roomNumber + " Not Found");
        }
    }
    
    public void displayBookedRoom(){
        System.out.println("\n Booked Rooms:");
        for(Room r:rooms){
            if(r.isAvailability()==false && r.getCustomer()!=null){
                r.displayRoomDetails();
            }
        }
    }
}
