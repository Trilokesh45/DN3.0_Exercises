public class NotifierTest {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        String message = "This is a test notification.";

        System.out.println("Sending via Email:");
        emailNotifier.send(message);

        System.out.println("\nSending via Email and SMS:");
        smsNotifier.send(message);

        System.out.println("\nSending via Email, SMS, and Slack:");
        slackNotifier.send(message);
    }
}