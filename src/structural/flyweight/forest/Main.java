package structural.flyweight.forest;

import java.util.Random;

public class Main {
    private static final String[] treeTypes = {"Oak", "Pine", "Mango"};
    private static final String[] colors = {"Green", "Dark Green", "Yellow"};
    private static final String[] textures = {"Smooth", "Rough"};

    public static void main(String[] args) {
        Forest forest = new Forest();
        Random random = new Random();

        int treeCount = 10000;
        for (int i = 0; i < treeCount; i++) {
            String type = treeTypes[random.nextInt(treeTypes.length)];
            String color = colors[random.nextInt(colors.length)];
            String texture = textures[random.nextInt(textures.length)];

            int x = random.nextInt(1000);
            int y = random.nextInt(1000);

            forest.plantTree(x, y, type, color, texture);
        }

        forest.drawForest();

        System.out.println("\n--- Forest Summary ---");
        System.out.println("Total trees planted: " + forest.totalTreesPlanted());
        System.out.println("Total unique TreeTypes: " + TreeFactory.totalTreeTypes());

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memory used (MB): " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}
