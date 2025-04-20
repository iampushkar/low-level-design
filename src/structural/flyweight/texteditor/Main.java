package structural.flyweight.texteditor;

import java.util.Random;

public class Main {
    private static final String[] fonts = {"Arial", "Times New Roman", "Courier New"};
    private static final String[] styles = {"Bold", "Italic", "Regular"};
    private static final Random random = new Random();

    public static void main(String[] args) {
        int glyphCount = 10000;
        for (int i = 0; i < glyphCount; i++) {
            String font = fonts[random.nextInt(fonts.length)];
            int size = random.nextInt(10) + 10; // Random size between 10 and 20
            String style = styles[random.nextInt(styles.length)];
            boolean is3D = random.nextBoolean();

            // Retrieve or create the character glyph using the flyweight factory
            CharacterGlyph glyph = CharacterFactory.getCharacterGlyph(font, size, style, is3D);

            // Render the character at random coordinates
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);
            glyph.render(x, y);
        }

        // Output the number of unique character glyphs used
        System.out.println("\n--- Glyphs Summary ---");
        System.out.println("Total unique CharacterGlyphs: " + CharacterFactory.totalCharacterGlyphs());
    }
}
