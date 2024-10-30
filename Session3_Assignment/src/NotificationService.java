import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService{
    List<INotificationObserver> notificationObserverList=new ArrayList<>();
    public String updateMsg;

    @Override
    public void addNotification(INotificationObserver notificationObserver) {
        notificationObserverList.add(notificationObserver);
    }

    @Override
    public void removeNotification(INotificationObserver notificationObserver) {
        notificationObserverList.remove(notificationObserver);
    }

    @Override
    public void notifyNotification() {
       for (INotificationObserver notificationObserver : notificationObserverList) {
           notificationObserver.updateNotification(updateMsg);
       }
    }

    public void setUpdateMsg(String updateMsg) {
        this.updateMsg = updateMsg;
        notifyNotification();
    }
}
