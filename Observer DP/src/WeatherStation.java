public class WeatherStation {
    public static void main(String[] args) {
        Temperature temp = new Temperature("30");
        Pressure pre = new Pressure("450");
        Humidity hum = new Humidity("12");

        Observer current = new CurrentCondition(temp);
        Observer forecast = new Forcast(pre);
        Observer stats = new StatDisplay(hum);

        temp.add(current);
        pre.add(forecast);
        hum.add(stats);
        hum.add(current);
        hum.add(forecast);

        // Simulate updates
        temp.setTemp_in_cel("33");
        hum.setHumid("20");
        pre.setPressure("500");
    }
}
