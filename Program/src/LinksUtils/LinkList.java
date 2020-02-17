package LinksUtils;

public class LinkList implements InsertFirst, DeleteFirst, DisplayList, Search, Delete {
    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void insertFirst(int id, double dd) {
        Link link = new Link(id, dd);
        link.next = this.first;
        this.first = link;
    }

    /**
     * Метод возвращает ссылку на удаленный элемент
     *
     * @return Link
     */
    public Link deleteFirst() {
        if (this.isEmpty()) {
            return null;
        }
        Link tmp = first;
        first = first.next;
        return tmp;
    }

    public void displayList() {
        Link current = first;
        System.out.print("\n Display al elements first --> last...");
        do {
            current.displayLink();
            current = current.next;
        } while (current != null);
    }

    /**
     * Метод поиска элемента с заданым ключём (iData)
     *
     * @param key - ключ для поиска
     * @return Link - ссылка на найденный элемент
     */
    public Link search(int key) {
        Link current = first;
        while (key != current.getiData()) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    /**
     * Метод удаления элемента с заданным ключём
     *
     * @param key - ключ элемента, который нужно удалить
     * @return Link - удаленный элемент
     */
    public Link delete(int key) {
        Link prev = first, current = first;
        while (key != current.getiData()) {
            prev = current;
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        prev.next = current.next;
        return current;
    }
}
