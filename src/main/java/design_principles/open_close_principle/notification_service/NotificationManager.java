package design_principles.open_close_principle.notification_service;

import design_principles.open_close_principle.notification_service.controller.Notification;
import design_principles.open_close_principle.notification_service.controller.NotificationFactory;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NotificationManager {

    NotificationFactory notificationFactory;

    public void sendNotification(Notification notification){
            notificationFactory.getNotificationService(notification.getType()).sendNotification(notification);
    }
}
