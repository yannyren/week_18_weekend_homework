package codeclan.com.thezoo;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.thezoo.Animals.Lion;
import codeclan.com.thezoo.Animals.Panda;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 10/11/2017.
 */

public class ZooTest {

    Zoo zoo;
    Enclosure<Lion> lionEnclosure;
    Lion lion;
    Enclosure<Panda> pandaEnclosure;
    Panda panda;
    Visitor visitor;


    @Before
    public void before() {
        this.zoo = new Zoo(10,0);
        this.lionEnclosure = new Enclosure<>();
        this.lion = new Lion(4300);
        this.pandaEnclosure = new Enclosure<>();
        this.panda = new Panda(4500);
        this.visitor = new Visitor("Jack", 3000);
    }

    @Test
    public void canAddEnclosure() {
        this.zoo.addEncloure(lionEnclosure);
        assertEquals(1, this.zoo.numberOfEnclosures());
    }

    @Test
    public void canRemoveEnclosure() {
        this.zoo.addEncloure(lionEnclosure);
        assertEquals(1, this.zoo.numberOfEnclosures());
        this.zoo.removeEnclosure(lionEnclosure);
        assertEquals(0, this.zoo.numberOfEnclosures());
    }

    @Test
    public void canCalculateTotalNumberOfAnimals(){
        this.lionEnclosure.addAnimals(lion);
        this.pandaEnclosure.addAnimals(panda);
        this.zoo.addEncloure(lionEnclosure);
        this.zoo.addEncloure(pandaEnclosure);
        assertEquals(2, this.zoo.calculateTotalNumberOfAnimals());
    }

    @Test
    public void canSellAnimalWhenWeHaveIt() {
        this.lionEnclosure.addAnimals(lion);
        this.zoo.addEncloure(lionEnclosure);
        assertEquals(4300, this.zoo.sellAnimal(lion));

    }

    @Test
    public void canNotSellAnimalWhenWeDontHaveIt() {
        assertEquals(0, this.zoo.sellAnimal(lion));
    }

    @Test
    public void canAddVisitors() {
        visitor.buyingTicket(10);
        this.zoo.addVisitors(visitor);
        assertEquals(1, zoo.numberOfVisitors());
    }

    @Test
    public void canShowAccountBalanceWhenVisitorsBuyTickets() {
        visitor.buyingTicket(10);
        zoo.addVisitors(visitor);
        assertEquals(10, this.zoo.accountBalanceWhenVisitorsBuyTickets());
    }

    @Test
    public void canCalculateTotalValueOfAnimals() {
        this.lionEnclosure.addAnimals(lion);
        this.pandaEnclosure.addAnimals(panda);
        zoo.addEncloure(lionEnclosure);
        zoo.addEncloure(pandaEnclosure);
        assertEquals(8800, this.zoo.calculateTotalValueOfAnimals());
    }

}
