package design_pattern.observer_pattern;

public class Publisher {

    public static void main(String[] args) {
        Observer observer = new Observer();
        observer.subsribe(new Subscriber("sub1"));
        observer.subsribe(new Subscriber("sub2"));
        observer.subsribe(new Subscriber("sub3"));
        observer.publishMessage("hello subscribers");
    }
}
