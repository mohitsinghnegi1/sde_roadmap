package design_principles.open_close_principle.pub_sub.interfaces;

import design_principles.open_close_principle.pub_sub.model.Event;

public interface ISubscriber {
    void handleEvent(Event event);
}
