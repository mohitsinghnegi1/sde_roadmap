package design_principles.open_close_principle.notification_service.controller;

import design_principles.open_close_principle.notification_service.enums.NotificationType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notification{
    NotificationType type;
    String message;
}
