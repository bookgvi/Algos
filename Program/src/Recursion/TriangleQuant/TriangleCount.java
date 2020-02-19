package Recursion.TriangleQuant;

import Recursion.Execute.Execute;

public class TriangleCount implements Execute<Integer> {
    private int counts;

    public TriangleCount(int counts) {
        this.counts = counts;
    }

    public int getTriangles(int position) {
        if (position <= 1) {
            System.out.print(position + ", ");
            return position;
        }
        int temp = position + this.getTriangles(position - 1);
        String comma = position == counts ? "" : ", ";
        System.out.print(temp + comma);
        return temp;
    }

    @Override
    public Integer exec(Integer val) {
        return this.getTriangles(val);
    }
}
