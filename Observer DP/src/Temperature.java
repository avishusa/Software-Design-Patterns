import java.util.HashSet;

public class Temperature implements Observable {

   private String temp_in_cel;
   private HashSet<Observer> observers;

   public Temperature(String temp) {
      observers = new HashSet<>();
      this.temp_in_cel = temp;
   }

   public String getTemp_in_cel() {
      return temp_in_cel;
   }

   public void setTemp_in_cel(String temp_in_cel) {
      this.temp_in_cel = temp_in_cel;
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
