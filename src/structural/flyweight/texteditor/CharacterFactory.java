package structural.flyweight.texteditor;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<String, CharacterGlyph> characterGlyphCache = new HashMap<>();

    // Method to get the glyph based on rendering type (2D or 3D)
    public static CharacterGlyph getCharacterGlyph(String font, int size, String style, boolean is3D) {
        String key = font + ":" + size + ":" + style + ":" + (is3D ? "3D" : "2D");
        if (!characterGlyphCache.containsKey(key)) {
            if (is3D) {
                characterGlyphCache.put(key, new ThreeDCharacterGlyph(font, size, style));
            } else {
                characterGlyphCache.put(key, new TwoDCharacterGlyph(font, size, style));
            }
        }
        return characterGlyphCache.get(key);
    }

    // Get the total number of different glyphs in the cache
    public static int totalCharacterGlyphs() {
        return characterGlyphCache.size();
    }
}
