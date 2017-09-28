package ua.com.owu.Entity.Dictionaries;

/**
 * Created by Roman Tymochko on 22.08.2017.
 */
public enum Color {
    BLACK("BLACK"),
    RED("RED"),
    BLUE("BLUE"),
    YELLOW("YELLOW"),
    GREEN("GREEN"),
    VIOLET("VIOLET"),
    PINK("PINK"),
    GREY("GREY"),
    SILVER("SILVER"),
    GOLD("GOLD"),
    WHITE("WHITE"),
    BROWN("BROWN");

    private final String text;

    private Color(String text) {
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
