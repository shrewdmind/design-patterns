package prototype;

public class Circle implements Component, Shape {
    public int radius;

    @Override
    public void render() {
        System.out.println("Rendering a Circle");
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Component cloneComponent() {
        System.out.println("Cloning a circle");
        return new Circle(radius);
    }

    @Override
    public void getArea() {

    }
}
