package ua.com.owu.Entity.Dictionaries;

/**
 * Created by Roman Tymochko on 22.08.2017.
 */
public enum Size {
    S("S"),
    M("M"),
    L("L"),
    XL("XL"),
    XXL("XXL");

    private final String text;

    private Size(String text) {
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
