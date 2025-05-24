import java.util.HashSet;

public class Humidity implements Observable {

    private String humid;
    private HashSet<Observer> observers;

    public Humidity(String humid) {
        this.humid = humid;
        observers = new HashSet<>();
    }

    public String getHumid() {
        return humid;
    }

    public void setHumid(String humid) {
        this.humid = humid;
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
