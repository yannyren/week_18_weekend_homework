package codeclan.com.thezoo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 10/11/2017.
 */

public class VisitorTest {
    Visitor visitor;


    @Before
    public void before() {
        this.visitor = new Visitor("Jack", 3000);
    }

    @Test
    public void hasName() {
        assertEquals("Jack", visitor.getName());
    }

    @Test
    public void canGetNumberOfTickets() {
        assertEquals(0, this.visitor.getNumberOfTickets());
    }

    @Test
    public void canBuyTickets() {
        int ticketPrice = 10;
        this.visitor.buyingTicket(10);
        assertEquals(1, this.visitor.getNumberOfTickets());
    }


}
