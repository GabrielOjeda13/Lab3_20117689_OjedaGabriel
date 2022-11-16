package org.example.tdas;

public class PixBit extends Pixel {
    int b;

    public PixBit(int x, int y, int d, int b) {
        super(x, y, d);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "PixBit{" +
                "b=" + b +
                '}';
    }
}
