public class ExtraaCheese extends Toppings{

    BasePizaa base;
    ExtraaCheese(BasePizaa base){
        this.base = base;
    }

    public int cost(){
        return base.cost()+2;
    }

}
