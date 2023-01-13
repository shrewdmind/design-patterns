package adapter;

public class Outlook implements EmailProvider {
    @Override
    public void sendEmail(Email email) {
        System.out.println("Sending out look email out");
    }
}
