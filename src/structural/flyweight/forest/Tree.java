package structural.flyweight.forest;

// Immutable Context class (extrinsic state)
record Tree(int x, int y, TreeType type) {
    public void draw() {
        type.draw(x, y);
    }
}