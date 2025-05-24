import java.util.HashSet;

public class Pressure implements Observable {

    private String pressure;
    private HashSet<Observer> observers;

    public Pressure(String pressure) {
        observers = new HashSet<>();
        this.pressure = pressure;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void add(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void remove(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.updateInfo();
        }
    }
}
