package codeclan.com.thezoo;

import java.util.ArrayList;

import codeclan.com.thezoo.Animals.Animal;

/**
 * Created by yanren on 10/11/2017.
 */

public class Enclosure<T extends Animal> {

    private ArrayList<T> animals;

    public Enclosure(){
        this.animals = new ArrayList<>();
    }

    public void addAnimals(T animal) {
        animals.add(animal);
    }

    public void removeAnimal(T animal) {
        animals.remove(animal);
    }

    public int animalsInEnclosure() {
       return this.animals.size();
    }

    public boolean checkTheAnimalInTheClosure(T animal) {
        return animals.contains(animal);
    }

    public void removeAnimalFromEnclosure(T animal) {
        if(animals.contains(animal)){
            animals.remove(animal);
        }
    }
}

//Enclosure<String> enclosure = new Enclosure();