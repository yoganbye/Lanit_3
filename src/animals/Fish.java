package animals;

import Except.WrongFoodException;
import food.Food;

public class Fish extends Herbivore implements Swim {

    @Override
    public String toString(){
        return "Рыба";
    }

    @Override
    public void swim() {
        System.out.println("Рыба плавает");
        
    }
    
    public void eat (Food food) throws WrongFoodException {
        System.out.println("Рыбе дали " + food);
        super.eat(food);

    }
}
