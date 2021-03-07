package animals;

import Aviary.AviarySize;
import Except.WrongFoodException;
import food.Food;

public class Fish extends Herbivore implements Swim {

    public Fish() {
        super();
    }

    public Fish(AviarySize inAviaries) {
        this.inAviaries = inAviaries;
    }

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

    @Override
    public String getIdNumber() {
        return idNumber;
    }
}
