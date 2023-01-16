package decorator;

public class CompressedCloudStream implements Stream {
    private final Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }
    @Override
    public void write(String data) {
        var compressedData = compress(data);
        stream.write(compressedData);
    }

    public String compress(String data) {
        return data.substring(2, 4);
    }
}
