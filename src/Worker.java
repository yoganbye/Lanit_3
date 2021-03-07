import Except.WrongFoodException;
import animals.*;
import food.Food;

public class Worker {
    public void feed(Animals animals, Food food) throws WrongFoodException {
        animals.eat(food);
        System.out.println("Рабочий покормил " + animals + "\n");
    }
    public void getVoice (Animals animals) {
        Voice voice = (Voice) animals;
        System.out.println(voice.voice());
        
    }
    
}
