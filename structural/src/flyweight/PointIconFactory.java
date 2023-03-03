package flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private final Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        if (!icons.containsKey(type)) {
            PointIcon newIcon = new PointIcon(type, null);
            icons.put(type, newIcon);
        }
        return icons.get(type);
    }
}
