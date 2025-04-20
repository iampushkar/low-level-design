package structural.flyweight.forest;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory - acts like a cache
class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        var key = name + ":" + color + ":" + texture;
        return treeTypes.computeIfAbsent(key, k -> new ConcreteTreeType(name, color, texture));
    }

    public static int totalTreeTypes() {
        return treeTypes.size();
    }
}