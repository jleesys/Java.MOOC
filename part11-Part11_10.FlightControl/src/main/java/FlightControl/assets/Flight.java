package FlightControl.assets;

public class Flight {

    private Plane plane;
    private String ID;
    private Place departure;
    private Place destination;

    //    public Flight(String ID,Place depart,Place dest) {
    public Flight(Plane plane, Place depart, Place dest) {
        this.ID = ID;
        this.departure = depart;
        this.destination = dest;
        this.plane = plane;
    }

    public String getID() {
        return this.ID;
    }

    public Place getDestination() {
        return this.destination;
    }

    public Place getDeparture() {
        return this.departure;
    }

    public String toString() {
        return this.plane.toString() + " (" + this.departure + "-" + this.destination + ")";
    }
}
