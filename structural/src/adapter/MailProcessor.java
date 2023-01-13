package adapter;

public class MailProcessor {
    public Email email;

    public MailProcessor(Email email) {
        this.email = email;
    }

    public void process(EmailProvider emailProvider)
    {
        emailProvider.sendEmail(email);
    }
}
