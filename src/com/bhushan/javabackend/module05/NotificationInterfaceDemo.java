package com.bhushan.javabackend.module05;

interface NotificationChannel {

    void send();
}

class EmailNotificationChannel implements NotificationChannel {

    private String recipient;

    public EmailNotificationChannel(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public void send() {
        System.out.println("Email sent to " + getRecipient());
    }
}

class SmsNotificationChannel implements NotificationChannel {

    private String recipient;

    public SmsNotificationChannel(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public void send() {
        System.out.println("SMS sent to " + getRecipient());
    }
}

class PushNotificationChannel implements NotificationChannel {

    private String recipient;

    public PushNotificationChannel(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public void send() {
        System.out.println("Push notification sent to " + getRecipient());
    }
}

public class NotificationInterfaceDemo {

    public static void main(String[] args) {

        EmailNotificationChannel email =
                new EmailNotificationChannel("Rohit@example.com");

        email.send();

        SmsNotificationChannel sms =
                new SmsNotificationChannel("85257441");

        sms.send();

        PushNotificationChannel push =
                new PushNotificationChannel("Rohit");

        push.send();
    }
}