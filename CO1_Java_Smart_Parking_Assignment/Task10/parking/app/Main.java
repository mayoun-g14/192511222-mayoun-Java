package parking.app;

import parking.model.Vehicle;
import parking.service.ParkingFacility;

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("TN01AB1234", "Car");

        ParkingFacility facility = new ParkingFacility();

        System.out.println("CAMPUS SMART PARKING SYSTEM");
        System.out.println("---------------------------");

        facility.parkVehicle(v1);

        System.out.println("\nReleasing Parking Slot:");

        facility.releaseSlot();

        System.out.println("\nTesting Encapsulation:");

        Integer a = 100;
        Integer b = 100;

        System.out.println("Integer Comparison: " + a.equals(b));
    }
}