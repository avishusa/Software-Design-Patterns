public class Forcast implements Observer {

    private Pressure pressure;

    public Forcast(Pressure pressure) {
        this.pressure = pressure;
    }

    @Override
    public void updateInfo() {
        System.out.println("Forecast updated based on pressure reading: " + pressure.getPressure() + " hPa");
    }
}
