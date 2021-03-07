package animals;
import Aviary.AviarySize;
import Except.WrongFoodException;
import food.Food;

import java.util.Objects;

/**
 * Animals
 */

public abstract class Animals {
    protected int satiety;
    protected AviarySize inAviaries;
    public static int idCount = 0;
    protected String idNumber = "";

    public Animals() {
        inAviaries = AviarySize.MEDIUM;
        idNumber += ++idCount;
    }

    public abstract void eat(Food food) throws WrongFoodException;

    public void getSatiety() {
        System.out.println("Сытость: " + satiety);
    }

    public abstract String getIdNumber();

    public AviarySize getInAviaries() {
        return inAviaries;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Animals)) {
            return false;
        }
        Animals animal = (Animals) obj;
        return idNumber.equals(animal.idNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCount);
    }
}