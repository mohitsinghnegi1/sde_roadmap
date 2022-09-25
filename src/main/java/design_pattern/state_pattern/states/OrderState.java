package design_pattern.state_pattern.states;

public interface OrderState {
    void cancelOrder() throws Exception;

    void makePayment() throws Exception;

    void deliverOrder() throws Exception;

    void getRefund() throws Exception;

    void trackOrder();
}
