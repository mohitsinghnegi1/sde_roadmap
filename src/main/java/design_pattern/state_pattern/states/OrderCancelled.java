package design_pattern.state_pattern.states;

import design_pattern.state_pattern.Order;

public class OrderCancelled implements OrderState{

    private final Order order;

    OrderCancelled(Order order){
        this.order = order;
    }
    
    @Override
    public void cancelOrder() throws Exception {
        throw new Exception("You order is already been canceled");
    }

    @Override
    public void makePayment() throws Exception {
        throw new Exception("Payment not allowed at cancelled state");
    }

    @Override
    public void deliverOrder() throws Exception {
        throw new Exception("Not applicable at cancelled order");
    }

    @Override
    public void getRefund() throws Exception {
        order.setState(new RefundDone(order));
    }

    @Override
    public void trackOrder() {
        System.out.println("Order cancelled & refund completed");
    }
}
