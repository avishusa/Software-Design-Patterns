public interface Observable {
   void add(Observer ob);
   void remove(Observer ob);
   void notifyObservers();
}
