package design_principles.open_close_principle.notification_service.interfaces;

import design_principles.open_close_principle.notification_service.controller.Notification;

public interface INotificationService {
    void sendNotification(Notification notification);
}
