package ua.com.owu.Entity.Dictionaries;
/**
 * Created by Roman Tymochko on 22.08.2017.
 */
public enum OrderStatus {

    //WAITING FOR
    WF_PROCESSING("WF_PROCESSING"),
    WF_PAYMENT("WF_PAYMENT"),
    WF_DELIVERY("WF_DELIVERY"),
    CLOSED("CLOSED"),
    CANCELED("CANCELED");

    private final String text;

    private OrderStatus(String text) {
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
