package ua.com.owu.Entity.Dictionaries;

/**
 * Created by Roman Tymochko on 01.09.2017.
 */
public enum Material {
    COTTON("COTTON"),
    DENIM("DENIM"),
    SILK("SILK"),

    METAL("METAL"),
    PLASTIC("PLASTIC");

    private final String text;

    private Material(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}
