package CoffeeMachineProject;

public class Coffee {

    private CoffeeTypes coffeeTypes;
    private CoffeeCondition coffeeCondition;
    private CoffeeSize coffeeSize;
    private boolean isMilk;

    public Coffee(CoffeeTypes coffeeTypes, CoffeeCondition coffeeCondition,
                  CoffeeSize coffeeSize, boolean isMilk) {
        this.coffeeTypes = coffeeTypes;
        this.coffeeCondition = coffeeCondition;
        this.coffeeSize = coffeeSize;
        this.isMilk = isMilk;
    }

    public Coffee() {

    }

    public CoffeeTypes getCoffeeTypes() {
        return coffeeTypes;
    }

    public void setCoffeeTypes(CoffeeTypes coffeeTypes) {
        this.coffeeTypes = coffeeTypes;
    }

    public CoffeeCondition getCoffeeCondition() {
        return coffeeCondition;
    }

    public void setCoffeeCondition(CoffeeCondition coffeeCondition) {
        this.coffeeCondition = coffeeCondition;
    }

    public CoffeeSize getCoffeeSize() {
        return coffeeSize;
    }

    public void setCoffeeSize(CoffeeSize coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public boolean isMilk() {
        return isMilk;
    }

    public void setMilk(boolean milk) {
        isMilk = milk;
    }
}
