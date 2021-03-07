package animals;

import Except.WrongFoodException;
import food.Food;

public class Rabbit extends Herbivore implements Voice, Run {

    @Override
    public String toString(){
        return "Кролик";
    }

    @Override
    public void run() {
        System.out.println("Кролик бежит");
        
    }

    @Override
    public String voice() {
        return "Кролик пищит";
    }

    public void eat (Food food) throws WrongFoodException {
        System.out.println("Кролику дали " + food);
        super.eat(food);

    }
    
}
