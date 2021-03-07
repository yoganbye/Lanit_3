package Aviary;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T> {
    private AviarySize aviarySize;

    public Aviary(AviarySize aviarySize) {
        this.aviarySize = aviarySize;
    }

    public Aviary() {
        aviarySize = AviarySize.MEDIUM;
    }

    private final Map<String, T> listAnimals = new HashMap<>();
    

    public void printAnimals() {
        for (String key: listAnimals.keySet()) {
            System.out.println(key + " " + listAnimals.get(key));
        }
    }

    public T getAnimal (String id) {
        return listAnimals.get(id);
    }

    public void delAnimal (String id) {
        listAnimals.remove(id);
    }


    public void addAnimal(String id, T animal, AviarySize aviarySize) {
        if (this.aviarySize == aviarySize) {
            listAnimals.put(id, animal);
        }
    }
}
