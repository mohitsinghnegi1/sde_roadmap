package design_pattern.state_pattern;

import design_pattern.state_pattern.states.InitialState;
import design_pattern.state_pattern.states.OrderState;

public class Order {

    private OrderState orderState = new InitialState(this);

    public void makePayment() throws Exception {
        orderState.makePayment();
    }

    public void trackOrder(){
        orderState.trackOrder();
    }

    public void deliverOrder() throws Exception {
        orderState.deliverOrder();
    }

    public void cancelOrder() throws Exception {
        orderState.cancelOrder();
    }

    public void getRefund() throws Exception {
        orderState.getRefund();
    }


    public void setState(OrderState orderState) {
        this.orderState = orderState;
    }
}
