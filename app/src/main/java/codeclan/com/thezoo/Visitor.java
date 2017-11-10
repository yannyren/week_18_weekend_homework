package codeclan.com.thezoo;

/**
 * Created by yanren on 10/11/2017.
 */

public class Visitor {

    private String name;
    private int moneyAvailable;
    private int ticketNumber;

    public Visitor(String name, int moneyAvailable) {
        this.name = name;
        this.moneyAvailable = moneyAvailable;
    }

    public boolean enoughMoney(int ticketPrice) {
        return this.moneyAvailable>=ticketPrice;
    }

    public void buyingTicket(int ticketPrice) {
        if (enoughMoney(ticketPrice)) {
            this.moneyAvailable -= ticketPrice;
        }

        this.ticketNumber +=1;
    }

    public int getTicketNumber() {
        return this.ticketNumber;
    }

}
