import adapter.Email;
import adapter.GmailAdapter;
import adapter.MailProcessor;
import adapter.gmailclient.Gmail;
import composite.SubTeam;
import composite.Team;
import decorator.CloudStream;
import decorator.CompressedCloudStream;
import decorator.EncryptedCloudStream;
import facade.NotificationService;

public class Main {
    public static void main(String[] args) {
        var stream = new CloudStream();
        var compress = new CompressedCloudStream(stream);
        var encrypt = new EncryptedCloudStream(compress);

        encrypt.write("skd kdoeihd dsiod");

        var notificationService = new NotificationService();
        notificationService.send("hello", "0.0.0.0");
    }
}