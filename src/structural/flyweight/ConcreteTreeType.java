package structural.flyweight;

record ConcreteTreeType(String name, String color, String texture) implements TreeType {
    @Override
    public void draw(int x, int y) {
        System.out.printf("Drawing %s tree at (%d, %d) with color %s and texture %s%n",
                name, x, y, color, texture);
    }
}
