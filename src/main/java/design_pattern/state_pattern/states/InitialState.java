package design_pattern.state_pattern.states;

import design_pattern.state_pattern.Order;

public class InitialState implements OrderState{

    private final Order order;

    public InitialState(Order order){
        this.order = order;
    }
    
    @Override
    public void cancelOrder() throws Exception {
        throw new Exception("NA");
    }

    @Override
    public void makePayment() throws Exception {
       order.setState(new PaymentDone(order));
    }

    @Override
    public void deliverOrder() throws Exception {
        throw new Exception("Please make payment ");
    }

    @Override
    public void getRefund() throws Exception {
        throw new Exception("NA");
    }

    @Override
    public void trackOrder() {
        System.out.println("NA");
    }
}
