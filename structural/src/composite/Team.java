package composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Composition {
    public List<Composition> compositeObj = new ArrayList<>();

    @Override
    public void deploy() {
        for(Composition comObj: compositeObj) {
            comObj.deploy();
        }
    }

    public void addSubTeam(Composition composition) {
        System.out.println("Added to deployment group");
        compositeObj.add(composition);
    }
}
