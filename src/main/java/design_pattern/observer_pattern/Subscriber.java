package design_pattern.observer_pattern;

public class Subscriber {

    private final String subscriberName;

    Subscriber(String name){
        this.subscriberName = name;
    }
    public void receiveMessage(String message) {
        System.out.println(subscriberName+" received a message : "+message);
    }
}
