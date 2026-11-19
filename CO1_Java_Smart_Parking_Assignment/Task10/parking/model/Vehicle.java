package parking.model;

public class Vehicle {

    private String registrationNumber;
    private String vehicleType;

    public Vehicle(String registrationNumber, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty()) {
            this.registrationNumber = registrationNumber;
        }
    }

    @Override
    public String toString() {
        return registrationNumber + " - " + vehicleType;
    }
}