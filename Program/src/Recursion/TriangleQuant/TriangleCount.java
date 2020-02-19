package Recursion.TriangleQuant;

import Recursion.Execute.Execute;

public class TriangleCount implements Execute {
    private int positionOfTriangle = 1;

    public int getTriangleAtPosition(int position) {
        if (position <= 1) {
            return 1;
        }
        return position + this.getTriangleAtPosition(position - 1);
    }

    @Override
    public Integer exec(Object val) {
        return this.getTriangleAtPosition((Integer) val);
    }
}
