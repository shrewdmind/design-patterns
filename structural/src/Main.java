import adapter.Email;
import adapter.GmailAdapter;
import adapter.MailProcessor;
import adapter.gmailclient.Gmail;
import composite.SubTeam;
import composite.Team;

public class Main {
    public static void main(String[] args) {
        var team = new Team();

        var subTeam = new SubTeam();
        var subTeam2 = new SubTeam();
        team.addSubTeam(subTeam);
        team.addSubTeam(subTeam2);

        team.deploy();

        var gmailProvider = new GmailAdapter(new Gmail());
        var mailProcessor = new MailProcessor(new Email());
        mailProcessor.process(gmailProvider);
    }
}