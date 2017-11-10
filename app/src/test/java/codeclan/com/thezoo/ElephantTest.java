package codeclan.com.thezoo;

import org.junit.Test;

import codeclan.com.thezoo.Animals.Elephant;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 10/11/2017.
 */

public class ElephantTest {
    @Test
    public void elephantHasValue() {
        Elephant elephant = new Elephant(3400);
        assertEquals(3400, elephant.getCashValue());
    }
}
