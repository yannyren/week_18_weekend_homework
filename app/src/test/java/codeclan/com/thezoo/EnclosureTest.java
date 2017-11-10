package codeclan.com.thezoo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import codeclan.com.thezoo.Animals.Animal;
import codeclan.com.thezoo.Animals.Lion;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 10/11/2017.
 */

public class EnclosureTest {
    Enclosure<Lion> enclosure;
    Lion lion;

    @Before
    public void before() {
        this.enclosure = new Enclosure();
        this.lion = new Lion(3400);
    }

    @Test
    public void canGetSizeOfTheEnclosure() {
        assertEquals(0, this.enclosure.animalsInEnclosure());
    }

    @Test
    public void canAddAnimals() {
        this.enclosure.addAnimals(lion);
        assertEquals(1, this.enclosure.animalsInEnclosure());

    }

    @Test
    public void canGetTotalCashValue() {
        this.enclosure.addAnimals(lion);
        assertEquals(3400, this.enclosure.getTotalCashValue());
    }

    @Test
    public void canCheckTheAnimalInTheClosure() {
        Lion lion = new Lion(3400);
        this.enclosure.addAnimals(lion);
        assertEquals(true, this.enclosure.checkTheAnimalInTheClosure(lion));
    }

    @Test
    public void canRemoveAnimalFromEnclosure() {
        Lion lion = new Lion(3400);
        this.enclosure.addAnimals(lion);
        assertEquals(true, this.enclosure.checkTheAnimalInTheClosure(lion));
        this.enclosure.removeAnimalFromEnclosure(lion);
        assertEquals(false, this.enclosure.checkTheAnimalInTheClosure(lion));
    }

    @Test
    public void canGetAnimals() {
        Lion lion = new Lion(3400);
        this.enclosure.addAnimals(lion);
        assertEquals(lion, this.enclosure.getAnimals().get(0));
    }




}
