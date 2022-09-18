package design_principles.open_close_principle.notification_service.controller;

import design_principles.open_close_principle.notification_service.enums.NotificationType;
import design_principles.open_close_principle.notification_service.interfaces.INotificationService;
import lombok.NonNull;

import java.util.HashMap;
import java.util.Map;


public class NotificationFactory {

    Map<NotificationType,INotificationService> notificationServiceProvider = new HashMap<>();

    public INotificationService getNotificationService(@NonNull final NotificationType type) {
        return notificationServiceProvider.get(type);
    }


    public void registerNotificationService(INotificationService notificationService,NotificationType type){
        notificationServiceProvider.put(type,notificationService);
    }
}
