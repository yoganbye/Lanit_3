package animals;

import Aviary.AviarySize;
import Except.WrongFoodException;
import food.Food;

public class Lion extends Carnivorous implements Voice, Run {

    public Lion() {
        super();
    }

    public Lion(AviarySize inAviaries) {
        this.inAviaries = inAviaries;
    }

    @Override
    public String toString(){
        return "Лев";
    }

    @Override
    public void run() {
        System.out.println("Лев бежит");
        
    }

    @Override
    public String voice() {
        return "Лев рычит";
    }

    public void eat (Food food) throws WrongFoodException {
        System.out.println("Льву дали " + food);
        super.eat(food);

    }

    @Override
    public String getIdNumber() {
        return idNumber;
    }

}
