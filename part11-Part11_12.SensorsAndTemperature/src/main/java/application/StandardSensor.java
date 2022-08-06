package application;

public class StandardSensor implements Sensor {

    private int number;

    public StandardSensor(int parameter) {
        this.number = parameter;
    }
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        return;
    }

    @Override
    public void setOff() {
        return;
    }

    @Override
    public int read() {
        return this.number;
    }
}
