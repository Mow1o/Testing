
import java.util.ArrayList;
import java.util.List;
class IceCreamMachine { // class
    public String[] ingredients; // instance variables
    public String[] toppings; // instance variables
    
    public static class IceCream { // static class
        public String ingredient;
        public String topping;

        public IceCream(String ingredient, String topping) {
            this.ingredient = ingredient;
            this.topping = topping;
        }
    }

    public IceCreamMachine(String[] ingredients, String[] toppings) { // constructor
        this.ingredients = ingredients;
        this.toppings = toppings;
    }

    public List<IceCream> scoops() { // method
        List<IceCream> result = new ArrayList<>(); // local variable 

        for (String ingredient : ingredients) { 
            for (String topping : toppings) { 
                IceCream iceCream = new IceCream(ingredient, topping);
                result.add(iceCream);
            }
        }

        return result;
        
    }

    public static void main(String[] args) {
        IceCreamMachine machine = new IceCreamMachine(new String[]{
                "vanilla", "chocolate"
        }, new String[]{
                "chocolate sauce"
        });
        List<IceCream> scoops = machine.scoops();

        /*
         * Should print:
         * vanilla, chocolate sauce
         * chocolate, chocolate sauce
         */
        for (IceCream iceCream : scoops) {
            System.out.println(iceCream.ingredient + ", " + iceCream.topping);
        }
    }
}