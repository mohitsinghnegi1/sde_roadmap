package design_pattern.state_pattern.states;

import design_pattern.state_pattern.Order;

public class RefundDone implements OrderState{

    private final Order order;

    RefundDone(Order order){
        this.order = order;
    }

    @Override
    public void cancelOrder() throws Exception {
        throw new Exception("Already canceled & refund been initiated");
    }

    @Override
    public void makePayment() throws Exception {
        throw new Exception("Not applicable on canceled order");
    }

    @Override
    public void deliverOrder() throws Exception {
        throw new Exception("Order cancelled & Refund already been done for this order");
    }

    @Override
    public void getRefund() throws Exception {
        throw new Exception("Refund already been done for this order");
    }

    @Override
    public void trackOrder() {
        System.out.println("Refund done");
    }
}
