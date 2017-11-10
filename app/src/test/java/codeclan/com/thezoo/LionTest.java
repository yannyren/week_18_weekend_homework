package codeclan.com.thezoo;

import org.junit.Test;

import codeclan.com.thezoo.Animals.Lion;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 10/11/2017.
 */

public class LionTest {
    @Test
    public void lionHasValue() {
        Lion lion = new Lion(3400);
        assertEquals(3400, lion.getCashValue());
    }
}
