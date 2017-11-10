package codeclan.com.thezoo;

import org.junit.Test;

import codeclan.com.thezoo.Animals.Elephant;

/**
 * Created by yanren on 10/11/2017.
 */

public class ElephantTest {
    @Test
    Elephant elephant = new Elephant(3400);
    assertEquals(3400, elephant.getValue());
}
