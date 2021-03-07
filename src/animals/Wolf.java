package animals;

import Aviary.AviarySize;
import Except.WrongFoodException;
import food.Food;

public class Wolf extends Carnivorous implements Voice, Run {

    public Wolf() {
        super();
    }

    public Wolf(AviarySize inAviaries) {
        this.inAviaries = inAviaries;
    }

    @Override
    public String toString(){
        return "Волк";
    }

    @Override
    public void run() {
        System.out.println("Волк бежит");
        
    }

    @Override
    public String voice() {
        return "Волк воет";
    }
    
    public void eat (Food food) throws WrongFoodException {
        System.out.println("Волку дали " + food);
        super.eat(food);

    }

    @Override
    public String getIdNumber() {
        return idNumber;
    }
}
