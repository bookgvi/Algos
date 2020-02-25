package Temp.LinkList;

public class Link implements ILink{
    public int id;
    public int fData;
    public ILink next;

    public Link(int id, int fData) {
        this.id = id;
        this.fData = fData;
        this.next = null;
    }

    @Override
    public int getfData() {
        return fData;
    }
}
