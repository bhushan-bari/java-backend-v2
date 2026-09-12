package com.bhushan.javabackend.module05;

class Notification {

    private String recipient;

    public Notification(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    public void send() {
        System.out.println("Sending generic notification");
    }
}

class EmailNotification extends Notification {

    public EmailNotification(String recipient) {
        super(recipient);
    }

    @Override
    public void send() {
        System.out.println("Sending Email to " + getRecipient());
    }
}

class SmsNotification extends Notification {

    public SmsNotification(String recipient) {
        super(recipient);
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + getRecipient());
    }
}

class PushNotification extends Notification {

    public PushNotification(String recipient) {
        super(recipient);
    }

    @Override
    public void send() {
        System.out.println("Sending Push Notification to " + getRecipient());
    }
}

public class NotificationPolymorphismDemo {

    public static void main(String[] args) {

        EmailNotification email =
                new EmailNotification("bhushan@example.com");

        email.send();

        SmsNotification sms =
                new SmsNotification("9876543210");

        sms.send();

        PushNotification push =
                new PushNotification("Bhushan");

        push.send();
    }
}