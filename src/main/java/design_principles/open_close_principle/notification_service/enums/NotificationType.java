package design_principles.open_close_principle.notification_service.enums;

public enum NotificationType{
    EMAIL("email"),
    SMS("sms");

    NotificationType(String o) {
        System.out.println("NotificationType: " + o);
    }
}