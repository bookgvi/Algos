package Temp.LinkList;

public class LinkList implements InsertFirst {
    private ILink first;

    public LinkList() {
        this.first = null;
    }

    @Override
    public void insertFirst(int id, int fData) {
        Link link = new Link(id, fData);
        link.next = this.first;
        this.first = link;
    }
}
