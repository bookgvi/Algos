package LinksUtils;

public class LinkList implements InsertFirst, DeleteFirst, DisplayList, Search, Delete, InsertSort {
    protected LinkWithKey first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void insertFirst(int id, int dd) {
        LinkWithKey linkWithKey = new LinkWithKey(id, dd);
        linkWithKey.next = this.first;
        this.first = linkWithKey;
    }

    /**
     * Метод возвращает ссылку на удаленный элемент
     *
     * @return Link
     */
    public LinkWithKey deleteFirst() {
        if (this.isEmpty()) {
            return null;
        }
        LinkWithKey tmp = first;
        first = (LinkWithKey) first.next;
        return tmp;
    }

    public void displayList() {
        LinkWithKey current = first;
        System.out.print("\n Display al elements first --> last...");
        do {
            current.displayLink();
            current = (LinkWithKey) current.next;
        } while (current != null);
    }

    /**
     * Метод поиска элемента с заданым ключём (iData)
     *
     * @param key - ключ для поиска
     * @return Link - ссылка на найденный элемент
     */
    public LinkWithKey search(int key) {
        LinkWithKey current = first;
        while (key != current.getiData()) {
            current = (LinkWithKey) current.next;
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
    public LinkWithKey delete(int key) {
        LinkWithKey prev = first, current = first;
        while (key != current.getiData()) {
            prev = current;
            current = (LinkWithKey) current.next;
            if (current == null) {
                return null;
            }
        }
        prev.next = current.next;
        return current;
    }

    public void insertFirst(int id, double dd) {

    }

    /**
     * Метод для вставки элемента в связанный список с учетом упорядоченности элементов
     *
     * @param val - элемент для вставки
     */
    public void insert(int val) {

    }
}
