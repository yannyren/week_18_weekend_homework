package codeclan.com.thezoo;

import org.junit.Test;

import codeclan.com.thezoo.Animals.Panda;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 10/11/2017.
 */

public class PandaTest {

    @Test
    public void pandaHasCashValue() {
        Panda panda = new Panda(3400);
        assertEquals(3400, panda.getCashValue());
    }
}
