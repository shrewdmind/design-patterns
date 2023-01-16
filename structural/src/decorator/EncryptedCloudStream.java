package decorator;

public class EncryptedCloudStream implements Stream {
    private final Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String eD = encrypt(data);
        stream.write(eD);
    }
    public String encrypt(String data) {
        return "Encrypting data\n Data: 29#(@dji((*32jd&#)ASDFai&*7s";
    }
}
