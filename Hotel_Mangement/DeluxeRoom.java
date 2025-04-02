package Hotel_Mangement;
class DeluxeRoom extends Room{
    
    private boolean seaView;

    public DeluxeRoom(int roomNumber, double price, boolean availability, boolean seaView) {
        super(roomNumber, price, availability);
        this.seaView = seaView;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

}