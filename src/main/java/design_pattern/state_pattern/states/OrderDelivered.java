package design_pattern.state_pattern.states;

import design_pattern.state_pattern.Order;

public class OrderDelivered implements OrderState{

    private final Order order;

    OrderDelivered(Order order){
        this.order = order;
    }
    @Override
    public void cancelOrder() {
        order.setState(new OrderCancelled(order));
    }

    @Override
    public void makePayment() throws Exception {
        throw new Exception("Payment already made");
    }

    @Override
    public void deliverOrder() throws Exception {
        throw new Exception("Order already been delivered");
    }

    @Override
    public void getRefund() throws Exception {
        throw new Exception("Please cancel the order to get refund");
    }

    @Override
    public void trackOrder() {
        System.out.println("Your order has been delivered");
    }
}
