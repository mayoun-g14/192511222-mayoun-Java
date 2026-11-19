package parking.service;

import parking.model.ParkingSlot;
import parking.model.Vehicle;

public class ParkingFacility {

    private ParkingSlot slot;

    public ParkingFacility() {
        slot = new ParkingSlot(1, 101);
    }

    public void parkVehicle(Vehicle vehicle) {

        if (!slot.isOccupied()) {
            slot.setOccupied(true);

            System.out.println("Vehicle Parked Successfully!");
            System.out.println("Vehicle: " + vehicle);
            System.out.println("Floor: " + slot.getFloorNumber());
            System.out.println("Slot: " + slot.getSlotNumber());

        } else {
            System.out.println("Parking Slot Already Occupied!");
        }
    }

    public void releaseSlot() {

        if (slot.isOccupied()) {
            slot.setOccupied(false);
            System.out.println("Parking Slot Released Successfully!");
        } else {
            System.out.println("Slot is Already Empty!");
        }
    }
}