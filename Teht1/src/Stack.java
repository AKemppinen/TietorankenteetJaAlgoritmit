public class Stack {
    private ListItem top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    public void push(String data) {
        ListItem listItem = new ListItem(data, top);
        top = listItem;
        size++;
    }

    public ListItem pop() {
        ListItem oldTop;
        oldTop = top;
        if(top != null) {
            top = top.getNext();
            size--;
        }

        return oldTop;
    }

    public void printItems() {
        String items = "";
        ListItem next = top;

        for(int i = 0; i < size; i++) {
            items += next.getData() + "\n";
            next = next.getNext();
        }
        System.out.println(items);

    }
    public int getSize() {
        return size;
    }

}
