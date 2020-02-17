package LinksUtils;

public class Link {
    private int iData;
    private double dData;
    public Link next;

    public Link(int id, double dd) {
        this.iData = id;
        this.dData = dd;
    }

    public void displayLink() {
        System.out.printf("\n{ %d, %f }", iData, dData);
    }
    public int getiData() {
        return iData;
    }
}
