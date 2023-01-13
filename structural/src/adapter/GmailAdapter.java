package adapter;

import adapter.gmailclient.Gmail;

public class GmailAdapter implements EmailProvider {
    public Gmail gmailClient;

    public GmailAdapter(Gmail gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void sendEmail(Email email) {
        gmailClient.init();
        gmailClient.compressMail(email);
        System.out.println("Sending email after compression");
    }
}
