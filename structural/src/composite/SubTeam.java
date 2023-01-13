package composite;

public class SubTeam implements Composition {
    @Override
    public void deploy() {
        System.out.println("Subteam deployment started.");
    }
}
