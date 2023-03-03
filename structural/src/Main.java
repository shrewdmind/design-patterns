import adapter.Email;
import adapter.GmailAdapter;
import adapter.MailProcessor;
import adapter.gmailclient.Gmail;
import bridge.AdvancedRemoteControl;
import bridge.MoveRemoteControl;
import bridge.RemoteControl;
import bridge.SonyDevice;
import composite.SubTeam;
import composite.Team;
import decorator.CloudStream;
import decorator.CompressedCloudStream;
import decorator.EncryptedCloudStream;
import facade.Message;
import facade.NotificationService;
import flyweight.PointIconFactory;
import flyweight.PointService;

public class Main {
    public static void main(String[] args) {
        var stream = new CloudStream();
        var compress = new CompressedCloudStream(stream);
        var encrypt = new EncryptedCloudStream(compress);
//
//        encrypt.write("skd kdoeihd dsiod");
//
//        var notificationService = new NotificationService();
//        notificationService.send("hello", "0.0.0.0");
        Message message = new Message("hey");

        System.out.println(message.toString());

        var service = new PointService(
                new PointIconFactory()
        );

        for (var point :
                service.getPoints()) {
            point.draw();
        }

        var sonyRemote = new MoveRemoteControl(new SonyDevice());
        sonyRemote.fastForward();

        var mainTeam = new Team();

        var subMainTeam = new Team();

        var subTeam = new SubTeam();
        subMainTeam.addSubTeam(subTeam);

        mainTeam.addSubTeam(subMainTeam);
        mainTeam.deploy();
        subMainTeam.deploy();
    }
}