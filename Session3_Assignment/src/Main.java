public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("\n-------------------------\n");
        Logger loggerObj=Logger.getLoggerInstance();
        OrderFactory orderFactory = new OrderFactory();

        IOrder onlineOrder = orderFactory.getInstance("online");
        onlineOrder.ProcessOrder();
        loggerObj.logPrint("\nLog: Online Order Processed");

        IOrder inStoreOrder = orderFactory.getInstance("inStore");
        inStoreOrder.ProcessOrder();
        loggerObj.logPrint("\nLog: Instore Order Processed");

        IOrder telephoneOrder = orderFactory.getInstance("telephone");
        telephoneOrder.ProcessOrder();
        loggerObj.logPrint("\nLog: Telephone Order Processed");

        //task 2
        System.out.println("\n-------------------------\n");
        ComputerBuilder computerBuilder = new ComputerBuilder()
                .setCPU(4200).setGPU(3000).setRAM(2000).setStorage(30);

        Computer computer = computerBuilder.build();
        computer.computerSpecification();

        Computer computerBuilderThirdApi = new ComputerBuilderAdapter().buildComputer("20","30",
                                                                                   "40","50");
        computerBuilderThirdApi.computerSpecification();

        //task 3
        System.out.println("\n-------------------------\n");
        INotifier notification = new BasicNotification();
        INotifier emailNotification = new NotificationDecorator(new EmailNotification(notification));
        emailNotification.SendNotification();
        INotifier smsNotification = new NotificationDecorator(new SMSNotification(notification));
        smsNotification.SendNotification();
        INotifier pushNotification = new NotificationDecorator(new PushNotification(notification));
        pushNotification.SendNotification();
        System.out.println("\n-------------------------\n");

        INotificationObserver admin=new Admin();
        INotificationObserver user=new User();
        INotificationObserver moderator=new Moderator();
        NotificationService notificationService = new NotificationService();

        notificationService.addNotification(admin);
        notificationService.addNotification(user);
        notificationService.addNotification(moderator);
        notificationService.setUpdateMsg("New event: A file was uploaded!");
        System.out.println("\n-------------------------\n");

        INotificationStrategy emailStrategy = new EmailStrategy();
        INotificationStrategy smsStrategy = new SMSStrategy();

        NotificationContext notificationContext=new NotificationContext(emailStrategy);
        notificationContext.notifySender("Sending notification via ");
        System.out.println("\n-------------------------\n");

        notificationContext=new NotificationContext(smsStrategy);
        notificationContext.notifySender("Sending notification via ");
        System.out.println("\n-------------------------\n");
    }
}