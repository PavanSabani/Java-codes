package Hotel_Mangement;
class Room{
    private int roomNumber;
    private double price;
    private boolean availability;
    private Customer customer;

    public Room(int roomNumber, double price, boolean availability) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.availability = availability;
        this.customer=null;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @Override
    public String toString() {
        return "Room [roomNumber=" + roomNumber + ", price=" + price + "]";
    }
    public void displayRoomDetails(){
        System.out.println("Room:"+ roomNumber+" Price:"+price+
        (availability ? " Available ":" Not Available ")+
        (customer!=null?"Booked by:"+customer.getName():" No Customer"));
    }
}