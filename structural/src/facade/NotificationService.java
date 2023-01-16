package facade;

public class NotificationService {
    public void send(String msg, String target) {
        var notificationObj = new NotificationServer();
        var conn = notificationObj.connect("1.1.1.1");
        var authToken = notificationObj.authenticate("3iei1", "828Ae92e1!2");
        notificationObj.sendMeassage(authToken, new Message(msg), target);
        conn.disconnect();
    }
}
