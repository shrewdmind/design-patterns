package facade;

public record Message(String msg) {
    @Override
    public String toString() {
        return "Just testing this out";
    }
}
