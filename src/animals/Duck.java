package animals;

import Aviary.AviarySize;
import Except.WrongFoodException;
import food.Food;

public class Duck extends Herbivore implements Fly, Swim, Voice, Run {

    public Duck() {
        super();
    }

    public Duck(AviarySize inAviaries) {
        this.inAviaries = inAviaries;
    }

    @Override
    public String toString(){
        return "Утка";
    }

    @Override
    public void run() {
        System.out.println("Утка бежит");
        
    }

    @Override
    public String voice() {
        return "Утка крякает";
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
        
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
        
    }

    public void eat (Food food) throws WrongFoodException {
        System.out.println("Утке дали " +  food.toString());
        super.eat(food);


    }

    @Override
    public String getIdNumber() {
        return idNumber;
    }


}
