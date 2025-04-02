package Hotel_Mangement;
class LuxaryRoom extends Room{

    private boolean jacuzziAvailable;
    
    public LuxaryRoom(int roomNumber, double price, boolean availability, boolean jacuzziAvailable) {
        super(roomNumber, price, availability);
        this.jacuzziAvailable = jacuzziAvailable;
    }

    public boolean isJacuzziAvailable() {
        return jacuzziAvailable;
    }

    public void setJacuzziAvailable(boolean jacuzziAvailable) {
        this.jacuzziAvailable = jacuzziAvailable;
    }
    
}
