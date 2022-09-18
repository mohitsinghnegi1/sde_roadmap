package design_principles.open_close_principle.notification_service.services;

import design_principles.open_close_principle.notification_service.controller.Notification;
import design_principles.open_close_principle.notification_service.interfaces.INotificationService;

public class EmailNotificationService implements INotificationService {
    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Sent Notification "+notification.getMessage()+" via "+notification.getType());
    }
}
