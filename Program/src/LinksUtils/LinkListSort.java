package LinksUtils;

public class LinkListSort extends LinkList implements Execute {
    LinkWithoutKey first;

    public LinkListSort() {
        super();
        first = null;
    }

    /**
     * Метод для вставки элемента в связанный список с учетом упорядоченности элементов
     *
     * @param val - элемент для вставки
     */
    @Override
    public void insert(int val) {
        LinkWithoutKey newLink = new LinkWithoutKey(val);
        LinkWithoutKey previous = null;
        LinkWithoutKey current = this.first;
        while (current != null && val > current.getdData()) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            this.first = newLink;
        } else {
            previous.next = newLink;
        }
        newLink.next = current;
    }

    public void displayList() {
        LinkWithoutKey current = first;
        String coma = "";
        while (current != null) {
            coma = current.next != null ? ", " : "\n";
            System.out.print(current.getdData() + coma);
            current = current.next;
        }
    }

    public void exec(int[] arr, LinkListSort linkListSort) {
        for (int val : arr) {
            linkListSort.insert(val);
        }
    }
}
