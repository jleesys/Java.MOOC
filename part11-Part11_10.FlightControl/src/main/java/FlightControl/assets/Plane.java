package FlightControl.assets;

public class Plane {

    private String ID;
    private int capacity;

    public Plane(String ID,int capacity) {
        this.ID = ID;
        this.capacity = capacity;
    }

    public String getID() {
        return this.ID;
    }

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public String toString() {
        return this.ID + " (" + this.capacity + " capacity)";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Plane)) {
            return false;
        }
        Plane comparison = (Plane) obj;

        if (this.ID.equals(comparison.getID())
            && this.capacity == comparison.capacity) {
            return true;
        }
        return false;
    }
}
