public class PizzaCalculator {
    public static void main(String[] args){

        BasePizaa farm = new Farmhouse() ;
        BasePizaa chesse = new Margherita();

        System.out.println("The price for farmhouse Pizza without add-ons :"+farm.cost());
        System.out.println("The price for Margherita Pizza without add-ons :"+chesse.cost());

        BasePizaa farmWithVeggies = new Veggies(farm);
        BasePizaa margheritaWithExtraCheese = new ExtraaCheese(chesse);

        System.out.println("The price for farmhouse Pizza after add-ons :"+farmWithVeggies.cost());
        System.out.println("The price for Margherita Pizza after add-ons :"+margheritaWithExtraCheese.cost());

    }
}
