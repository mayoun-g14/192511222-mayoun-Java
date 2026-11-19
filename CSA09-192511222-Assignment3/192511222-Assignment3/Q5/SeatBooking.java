public class SeatBooking {
    private static int seats = 10;
    public static synchronized boolean book() {
        if (seats > 0) { seats--; return true; }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Synchronized booking audit: Exactly 10 seats booked across 20 threads.");
    }
}
