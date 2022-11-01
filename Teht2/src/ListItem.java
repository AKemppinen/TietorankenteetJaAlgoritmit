import java.util.List;

public class ListItem {
    private String data;
    private ListItem next;

    public ListItem(String data, ListItem next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public void setNext(ListItem listitem) {
        this.next = listitem;
    }

    public ListItem getNext() {
        return next;
    }
}
