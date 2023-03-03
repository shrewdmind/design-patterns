package prototype;

public class Text implements Component {
    private final int size;

    public Text(int size) {
        this.size = size;
    }

    @Override
    public void render() {
        System.out.println("Rendering a Text");
    }

    @Override
    public Component cloneComponent() {
        System.out.println("Text Created");
        return new Text(size);
    }
}
