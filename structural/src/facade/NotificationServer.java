package facade;

public class NotificationServer {
    public Connection connect(String ipAddr) {
        return new Connection();
    }

    public Authentication authenticate(String appID, String key) {
        return new Authentication();
    }

    public void sendMeassage(Authentication token, Message msg, String target) {
        System.out.println("Message sent.");
    }
}
