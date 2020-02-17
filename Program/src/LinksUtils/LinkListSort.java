package LinksUtils;

public class LinkListSort extends LinkList {
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
}
