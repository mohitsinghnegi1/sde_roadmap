package design_principles.open_close_principle.notification_service;

import design_principles.open_close_principle.notification_service.controller.Notification;
import design_principles.open_close_principle.notification_service.controller.NotificationFactory;
import design_principles.open_close_principle.notification_service.enums.NotificationType;
import design_principles.open_close_principle.notification_service.services.EmailNotificationService;
import design_principles.open_close_principle.notification_service.services.SmsNotificationService;
import junit.framework.TestCase;
import org.junit.Test;

public class NotificationManagerTest extends TestCase {

    NotificationManager notificationManager;

    @Test
    public void testSendSMSNotification() {
        this.notificationManager.sendNotification(new Notification(NotificationType.SMS," this is sms notification"));
    }

    @Test
    public void testEmailSMSNotification() {
        this.notificationManager.sendNotification(new Notification(NotificationType.EMAIL," this is email notification"));
    }

    public void setUp() throws Exception {
        super.setUp();
        NotificationFactory notificationFactory = new NotificationFactory();
        notificationFactory.registerNotificationService(new EmailNotificationService(),NotificationType.EMAIL);
        notificationFactory.registerNotificationService(new SmsNotificationService(),NotificationType.SMS);
        this.notificationManager = new NotificationManager(notificationFactory);
    }

    public void tearDown() throws Exception {
    }
}