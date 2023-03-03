package prototype;

public class ContextMenu {
    private final Component component;

    public ContextMenu(Component component) {
        this.component = component;
    }

    public void duplicateComponent() {
        component.render();
        component.cloneComponent();
    }
}
