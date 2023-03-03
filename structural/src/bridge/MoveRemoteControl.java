package bridge;

public class MoveRemoteControl extends AdvancedRemoteControl {
    public MoveRemoteControl(Device device) {
        super(device);
    }

    public void rewind() {
        device.rewind();
    }

    public void fastForward() {
        device.fastForward();
    }

    public void play() {
        device.play();
    }

    public void pause() {
        device.pause();
    }
}
