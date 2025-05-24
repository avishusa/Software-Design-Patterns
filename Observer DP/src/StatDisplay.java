public class StatDisplay implements Observer {

    private Humidity humidity;

    public StatDisplay(Humidity humidity) {
        this.humidity = humidity;
    }

    @Override
    public void updateInfo() {
        System.out.println("The most recent measure of humidity is: " + humidity.getHumid() + "%");
    }
}
