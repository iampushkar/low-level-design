package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void drawForest() {
        trees.forEach(Tree::draw);
    }

    public int totalTreesPlanted() {
        return trees.size();
    }
}
