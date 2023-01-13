package adapter.gmailclient;

import adapter.Email;

public class Gmail {
    public void init() { }

    public void compressMail(Email email) {
        System.out.println("Compressing email");
    }

    public void sendEmail(Email email) {
        System.out.println("Sending gmail email");
    }
}
