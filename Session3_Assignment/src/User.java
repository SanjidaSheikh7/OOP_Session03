public class User implements INotificationObserver{
    public String updateMsg;

    @Override
    public void updateNotification(String updateMsg) {
        this.updateMsg = updateMsg;
        displayNotification();
    }

    public void displayNotification(){
        System.out.println("User received:" + " " + this.updateMsg);
    }
}
