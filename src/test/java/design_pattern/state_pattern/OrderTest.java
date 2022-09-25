package design_pattern.state_pattern;

import junit.framework.TestCase;

public class OrderTest extends TestCase {

    private Order order;

    public void setUp() throws Exception {
        super.setUp();
        this.order = new Order();
    }

    public void testMakePayment() throws Exception {

        this.order.makePayment();
        this.order.deliverOrder();
        this.order.cancelOrder();
        this.order.trackOrder();
        this.order.getRefund();


//        // reset to initial state
        this.order = new Order();

        this.order.makePayment();
        this.order.deliverOrder();
        this.order.trackOrder();
        this.order.getRefund();



        // reset to initial state
        this.order = new Order();
        this.order.deliverOrder();

    }

}