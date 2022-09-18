package design_principles.open_close_principle.pub_sub;

import design_principles.open_close_principle.pub_sub.model.Event;
import design_principles.open_close_principle.pub_sub.services.DataProcessingService;
import design_principles.open_close_principle.pub_sub.services.LogService;
import junit.framework.TestCase;

public class PublisherTest extends TestCase {

    Publisher publisher;

    public void testPublishEvent() {
        publisher.publishEvent(new Event("Event Published Data"));
        publisher.publishEvent(new Event("Second Event Published Data"));
    }

    public void setUp() throws Exception {
        super.setUp();
        publisher = new Publisher();
        publisher.subscribe(new LogService());
        publisher.subscribe(new DataProcessingService());
    }

    public void tearDown() throws Exception {
    }
}