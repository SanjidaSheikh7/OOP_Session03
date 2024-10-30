public class SMSStrategy implements INotificationStrategy{
    @Override
    public void sendNotification(String message) {
        System.out.println(message + "SMS Strategy");
    }
}
