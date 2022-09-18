package design_principles.open_close_principle.pub_sub.services;

import design_principles.open_close_principle.pub_sub.interfaces.ISubscriber;
import design_principles.open_close_principle.pub_sub.model.Event;

public class LogService implements ISubscriber {
    @Override
    public void handleEvent(Event event) {
        // Handle event
        System.out.println("Logging event received from publisher "+event);
    }
}
