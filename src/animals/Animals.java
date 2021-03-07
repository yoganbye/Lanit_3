package animals;
import Except.WrongFoodException;
import food.Food;

/**
 * Animals
 */

public abstract class Animals {
    protected int satiety; 

    public abstract void eat(Food food) throws WrongFoodException;

    public void getSatiety() {
        System.out.println("Сытость: " + satiety);
    }

}