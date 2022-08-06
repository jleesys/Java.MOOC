package application;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {

    private List<Sensor> list;
    private List<Integer> list2;

    public AverageSensor() {
        this.list = new ArrayList<>();
        this.list2 = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.list.add(toAdd);
    }

    public List<Integer> readings() {
        return this.list2;
    }

    @Override
    public boolean isOn() {
//        for (Sensor s : this.list) {
//            if (s.isOn() == false) {
//                return false;
//            }
//        }
//        return true;

//        Iterator iti = this.list.iterator();
//        while (iti.hasNext()) {
//            Sensor sensing = (Sensor) iti.next();
//            if (sensing.isOn() == false) {
//                return false;
//            }
//        }
//       return true;

        List<Boolean> boolList = this.list.stream().map(s -> s.isOn()).collect(Collectors.toList());
        if (boolList.contains(false)) {
            return false;
        }
        return true;
    }

    @Override
    public void setOn() {
        this.list.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        this.list.stream().forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        if (!this.isOn()
            || this.list.isEmpty()) {
            throw new IllegalStateException();
        }
        int gaba = (int) this.list.stream().map(s -> s.read()).mapToInt(i -> i).average().getAsDouble();  //reduce(0,(subtotal,next) -> subtotal + next).average().get;
        this.list2.add(gaba);
        return gaba;
        //int gabar = (int) gaba;
    }
}
