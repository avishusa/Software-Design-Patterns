public class CurrentCondition implements Observer {

    private Temperature temperature;

    public CurrentCondition(Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public void updateInfo() {
        System.out.println("The most recent temperature is: " + temperature.getTemp_in_cel() + "°C");
    }
}
