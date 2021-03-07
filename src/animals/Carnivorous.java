package animals;

import Except.WrongFoodException;
import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animals {
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println("Животное сьело мясо!");
            satiety += food.getValueFood();

        } else {
            System.out.println("Данный тип еды не подходит для животного!");
        }
        
    }
    
}

    
