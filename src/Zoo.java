import Aviary.Aviary;
import Aviary.AviarySize;
import Except.WrongFoodException;
import animals.*;
import food.*;

public class Zoo {
    public static void main(String[] args) throws WrongFoodException {
        Herbivore duck = new Duck(AviarySize.SMALL);
        Herbivore fish = new Fish(AviarySize.LARGE);
        Carnivorous crocodile = new Crocodile(AviarySize.BIG);
        Carnivorous lion = new Lion(AviarySize.BIG);
        Herbivore rabbit = new Rabbit(AviarySize.MEDIUM);
        Carnivorous wolf = new Wolf(AviarySize.MEDIUM);

        Food chickenMeat = new ChickenMeat();

        Food corn = new Corn();
        Food rabbitMeat = new RabbitMeat();
        Food oats = new Oats();

        Worker worker = new Worker();

        Aviary<Carnivorous> aviaryCairns = new Aviary<Carnivorous>(AviarySize.BIG);
        Aviary<Herbivore> aviaryHer = new Aviary<Herbivore>(AviarySize.LARGE);
        aviaryHer.addAnimal(duck.getIdNumber(), duck, duck.getInAviaries());
        aviaryHer.addAnimal(fish.getIdNumber(), fish, fish.getInAviaries());
        aviaryHer.addAnimal(rabbit.getIdNumber(), rabbit, rabbit.getInAviaries());
        aviaryCairns.addAnimal(crocodile.getIdNumber(), crocodile, crocodile.getInAviaries());
        aviaryCairns.addAnimal(lion.getIdNumber(), lion, lion.getInAviaries());
        aviaryCairns.addAnimal(wolf.getIdNumber(), wolf, wolf.getInAviaries());
        aviaryCairns.printAnimals();
        aviaryHer.printAnimals();
        
        worker.feed(duck, rabbitMeat);

    }
}
