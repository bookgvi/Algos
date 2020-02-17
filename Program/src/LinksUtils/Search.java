package LinksUtils;

public interface Search {
    /**
     * Метод поиска элемента с заданым ключём (iData)
     *
     * @param key - ключ для поиска
     * @return Link - ссылка на найденный элемент
     */
    LinkWithKey search(int key);
}
