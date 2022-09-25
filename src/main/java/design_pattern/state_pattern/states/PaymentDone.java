package design_pattern.state_pattern.states;

import design_pattern.state_pattern.Order;

public class PaymentDone implements OrderState{

    private final Order order;

    PaymentDone(Order order){
        this.order = order;
    }
    
    @Override
    public void cancelOrder() {
        this.order.setState(new OrderCancelled(this.order));
    }

    @Override
    public void makePayment() throws Exception {
        throw new Exception("Payment is already done");
    }

    @Override
    public void deliverOrder() {
        this.order.setState(new OrderDelivered(order));
    }

    @Override
    public void getRefund() throws Exception {
        throw new Exception("Please cancel the order to get refund");
    }

    @Override
    public void trackOrder() {
        System.out.println("Your order has been dispatched");
    }
}
