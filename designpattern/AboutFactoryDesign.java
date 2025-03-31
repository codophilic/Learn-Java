// Step:1
// Product interface
interface Dish {
    void prepare();
    void serve();
}

//Step 2: Create Concrete Products
// Concrete products
class Pizza implements Dish {
    @Override
    public void prepare() {
        System.out.println("Preparing pizza...");
    }

    @Override
    public void serve() {
        System.out.println("Serving pizza...");
    }
}

class Sushi implements Dish {
    @Override
    public void prepare() {
        System.out.println("Preparing sushi...");
    }

    @Override
    public void serve() {
        System.out.println("Serving sushi...");
    }
}

//Step 3: Define the Factory Interface
// Factory interface
interface DishFactory {
    Dish createDish();
}

//Step 4: Create Concrete Factories
// These Concrete factories will return the Concrete Products (Pizza or Sushi) for the Product (Dish)
class PizzaFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Pizza();
    }
}

class SushiFactory implements DishFactory {
    @Override
    public Dish createDish() {
        return new Sushi();
    }
}

//Step 5: Client Code or Customer Ordering dishes
public class AboutFactoryDesign {
    public static void main(String[] args) {
                // Order a pizza using the PizzaFactory
                DishFactory pizzaFactory = new PizzaFactory();
                Dish pizza = pizzaFactory.createDish();
                pizza.prepare();
                pizza.serve();
        
                // Order sushi using the SushiFactory
                DishFactory sushiFactory = new SushiFactory();
                Dish sushi = sushiFactory.createDish();
                sushi.prepare();
                sushi.serve();
    }
}
