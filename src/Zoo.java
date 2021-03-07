import Except.WrongFoodException;
import animals.*;
import food.*;

public class Zoo {
    public static void main(String[] args) throws WrongFoodException {
        Animals duck = new Duck();
        Animals fish = new Fish();
        Animals crocodile = new Crocodile();
        Animals lion = new Lion();
        Animals rabbit = new Rabbit();
        Animals wolf = new Wolf();

        Food chickenMeat = new ChickenMeat();
        Food corn = new Corn();
        Food rabbitMeat = new RabbitMeat();
        Food oats = new Oats();

        Worker worker = new Worker();
        
        worker.feed(duck, rabbitMeat);
        worker.feed(rabbit, oats);
        worker.feed(lion, chickenMeat);
        worker.feed(crocodile, corn);

        worker.feed(fish, corn);
        fish.getSatiety();
        worker.feed(fish, corn);
        fish.getSatiety();

        Animals[] prude = {duck, fish};
        for (Animals animals : prude) {
            Swim swimmer = (Swim) animals;
            swimmer.swim();
        }



    }
}
