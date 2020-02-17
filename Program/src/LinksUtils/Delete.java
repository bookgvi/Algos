package LinksUtils;

public interface Delete {
    /**
     * Метод удаления элемента с заданным ключём
     *
     * @param key - ключ элемента, который нужно удалить
     * @return Link - удаленный элемент
     */
    Link delete(int key);
}
