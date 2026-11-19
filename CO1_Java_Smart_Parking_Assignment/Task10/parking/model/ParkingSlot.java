package parking.model;

public class ParkingSlot {

    private int floorNumber;
    private int slotNumber;
    private boolean occupied;

    public ParkingSlot(int floorNumber, int slotNumber) {
        this.floorNumber = floorNumber;
        this.slotNumber = slotNumber;
        this.occupied = false;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void displaySlot() {
        System.out.println("Floor: " + floorNumber);
        System.out.println("Slot: " + slotNumber);
        System.out.println("Occupied: " + occupied);
    }
}