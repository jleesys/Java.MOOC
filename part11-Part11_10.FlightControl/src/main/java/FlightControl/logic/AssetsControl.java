package FlightControl.logic;
import FlightControl.assets.Flight;
import FlightControl.assets.Place;
import FlightControl.assets.Plane;
import java.util.HashMap;
import java.util.Map;

public class AssetsControl {

    private Map<String,Flight> Flights;
    private Map<String,Plane> Planes;
    private int iterator;

    public AssetsControl() {
        this.Flights = new HashMap();
        this.Planes = new HashMap<>();
        this.iterator = 0;
    }

    public void addPlane(String ID,Plane plane) {
        this.Planes.putIfAbsent(ID,plane);
    }

    public void addFlight(String ID,Flight flight) {
        String placer = ID + String.valueOf(iterator);
        this.Flights.putIfAbsent(placer,flight);
        iterator++;
    }

    public Plane getPlane(String ID) {
        return this.Planes.get(ID);
    }

    public boolean checkPlanes(String key) {
        if (this.Planes.containsKey(key)) {
            return true;
        }
        return false;
    }

    public void printPlanes() {
        for (String plane: this.Planes.keySet()) {
            System.out.println(this.Planes.get(plane));
        }
    }

    public void printFlights() {
//        this.Flights.values().stream().forEach(flight -> System.out.println(flight));
        for (String plane : this.Flights.keySet()) {
            System.out.println(this.Flights.get(plane));
        }
    }
}
