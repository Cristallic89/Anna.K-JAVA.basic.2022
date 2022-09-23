package week9.measurements;

public class ConstantSensor implements Sensor{
    private int measuredValue;

    public ConstantSensor(int measuredValue) {
        this.measuredValue = measuredValue;
    }

    @Override
    public int measure() {
        return this.measuredValue;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
        // do not do anything
    }

    @Override
    public void off() {
        // do not do anything
    }
}