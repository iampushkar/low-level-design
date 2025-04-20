package structural.flyweight.texteditor;

record ThreeDCharacterGlyph(String font, int size, String style) implements CharacterGlyph {
    @Override
    public void render(int x, int y) {
        System.out.println("3D Rendering character with font: " + font + ", size: " + size + ", style: " + style + " at (" + x + ", " + y + ")");
    }
}
