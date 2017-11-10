package codeclan.com.thezoo;

import java.util.ArrayList;

import codeclan.com.thezoo.Animals.Animal;



/**
 * Created by yanren on 10/11/2017.
 */

public class Zoo {
    private int ticketPrice;
    private int account;
    private ArrayList<Enclosure> enclosureList;
    private ArrayList<Visitor> visitors;

    public Zoo(int ticketPrice, int account) {
        this.ticketPrice = ticketPrice;
        this.account = account;
        this.enclosureList = new ArrayList<>();
        this.visitors = new ArrayList<>();
    }

    public void addEncloure(Enclosure enclosure) {
        enclosureList.add(enclosure);
    }

    public void removeEnclosure(Enclosure enclosure) {
        enclosureList.remove(enclosure);
    }

    public int calculateTotalNumberOfAnimals() {
        int totalNumber = 0;
        for(Enclosure enclosure : this.enclosureList) {
            totalNumber += enclosure.animalsInEnclosure();
        }
        return totalNumber;
    }

    public int sellAnimal(Animal animal){
        //check if animal is in the closure
        for(Enclosure enclosure : enclosureList) {
            //enclosure.checkTheAnimalInTheClosure(animal) ?
            //        enclosure.removeAnimalFromEnclosure(animal) : System.out.println("No such animal");
            if (enclosure.checkTheAnimalInTheClosure(animal)) {
                enclosure.removeAnimalFromEnclosure(animal);
                this.account += animal.getCashValue();
            } else {
                System.out.println("We don't have this animal in the zoo.");
            }
        }
        return account;
    }

    public void addVisitors(Visitor visitor){
        if(visitor.getNumberOfTickets() > 0) {
            this.visitors.add(visitor);
        }
    }

    public int numberOfVisitors() {
        return this.visitors.size();
    }

    public int accountBalanceWhenVisitorsBuyTickets() {
       int accountBalance = this.account + this.numberOfVisitors() * this.ticketPrice;
       return accountBalance;
    }


    public int numberOfEnclosures() {
       return this.enclosureList.size();
    }

    public int calculateTotalValueOfAnimals() {
        int animalValue = 0;
        for(Enclosure enclosure : enclosureList) {

            animalValue += enclosure.getTotalCashValue() ;

        } return animalValue;
    }
}
