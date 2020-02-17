package LinksUtils;

public class LinkWithKey extends LinkWithoutKey {
    private int iData;

    public LinkWithKey(int id, int dd) {
        super(dd);
        this.iData = id;
    }

    public void displayLink() {
        System.out.printf("\n{ %d, %d }", iData, dData);
    }

    public int getiData() {
        return iData;
    }
}
