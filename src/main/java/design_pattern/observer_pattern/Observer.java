package design_pattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Observer {

    List<Subscriber>  subscribers = new ArrayList<>();

    void publishMessage(String message){
        for (Subscriber subscriber: subscribers) {
            subscriber.receiveMessage(message);
        }
    }



    void subsribe(Subscriber subscriber){
        subscribers.add(subscriber);

    }

}
