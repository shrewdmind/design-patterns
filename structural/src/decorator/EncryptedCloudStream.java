package decorator;

public class EncryptedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        String eD = encrypt(data);
        super.write(eD);
    }

    public String encrypt(String data) {
        return "Encrypting\nEncrypted Data: 29#(@dji((*32jd&#)ASDFai&*7s";
    }
}
