package bridge;

public class SonyDevice implements Device {
    @Override
    public void turnOn() {
        System.out.println("Sony: Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Turn Off");
    }

    @Override
    public void setChannel() {
        System.out.println("Sony: Set Channel");
    }

    @Override
    public void rewind() {
        System.out.println("Sony: Rewind");
    }

    @Override
    public void fastForward() {
        System.out.println("Sony: Fast Forward");
    }

    @Override
    public void play() {
        System.out.println("Sony: Play");
    }

    @Override
    public void pause() {
        System.out.println("Sony: Pause");
    }
}
