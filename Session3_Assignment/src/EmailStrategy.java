public class EmailStrategy implements INotificationStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println(message + "Email Strategy");
    }
}
