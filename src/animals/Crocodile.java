package animals;

import Except.WrongFoodException;
import food.Food;

public class Crocodile extends Carnivorous implements Swim, Voice, Run {

    @Override
    public String toString(){
        return "Крокодил";
    }

    @Override
    public void run() {
        System.out.println("Крокодил бежит");
        
    }

    @Override
    public String voice() {
        
        return "Крокодил издает крокодильи звуки";
    }

    @Override
    public void swim() {
        System.out.println("Крокодил плавает");
        
    }
    
    public void eat (Food food) throws WrongFoodException {
        System.out.println("Крокодилу дали " + food);
        super.eat(food);

    }
}
