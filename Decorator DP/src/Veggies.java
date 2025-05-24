public class Veggies extends Toppings{

    BasePizaa base;
    Veggies(BasePizaa base){
        this.base = base;
    }

    public int cost(){
        return base.cost()+1;
    }
}
