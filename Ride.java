package bridgelabz.workshop;

public class Ride {
    public static final String NORMAL = "NORMAL";
    public static final String PREMIUM = "PREMIUM";

    public final double distance;
    public final int time;
    public final String rideType;

    public Ride(double distance, int time, String rideType) {
        this.distance = distance;
        this.time = time;
        this.rideType = rideType;
    }
}
  