package design_principles.open_close_principle.pub_sub;

import design_principles.open_close_principle.pub_sub.interfaces.ISubscriber;
import design_principles.open_close_principle.pub_sub.model.Event;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
// This class is open for extension but close to modification
// Let say we wat to emit the event to all the subscriber
public class Publisher {

    private Set<ISubscriber> subscribers = Collections.synchronizedSet(new HashSet<>());

    public void publishEvent(Event event){
        subscribers.forEach(subscriber -> {
            subscriber.handleEvent(event);
        });
    }

    public void subscribe(ISubscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unSubscribe(ISubscriber subscriber){
        subscribers.remove(subscriber);
    }
}
