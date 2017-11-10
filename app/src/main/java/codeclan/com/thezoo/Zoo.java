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

//    public void sellAnimal(Animal animal){
//        //check if animal is in the closure
//
//            for(Enclosure enclosure : this.enclosureList) {
//            enclosure.checkTheAnimalInTheClosure(animal);
//        }
//
//
//    }

    public void addVisitors(Visitor visitor){
        if(visitor.getTicketNumber() > 0) {
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


}
