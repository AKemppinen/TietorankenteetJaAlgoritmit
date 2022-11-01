public class Queue {
    private ListItem first;
    private int size;

    public Queue() {
        first = null;
        size = 0;
    }

    public void push(String data) {
        ListItem listItem = new ListItem(data, null);
        ListItem temp = first;
        size++;
        if (first == null) {
            first = listItem;
            return;
        }

        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(listItem);
    }

    public ListItem pop() {
        ListItem oldTop;
        oldTop = first;
        if(first != null) {
            first = first.getNext();
            size--;
        }

        return oldTop;
    }

    public void printItems() {
        String items = "";
        ListItem next = first;

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
