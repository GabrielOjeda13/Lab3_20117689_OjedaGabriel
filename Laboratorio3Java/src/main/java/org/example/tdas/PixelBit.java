package org.example.tdas;

public class PixelBit {
    int x;
    int y;
    int d;
    int bit;

    public PixelBit(int x, int y, int d, int bit) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.bit = bit;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getBit() {
        return bit;
    }

    public void setBit(int bit) {
        this.bit = bit;
    }

    @Override
    public String toString() {
        return "PixelBit{" +
                "bit=" + bit +
                ", x=" + x +
                ", y=" + y +
                ", d=" + d +
                '}';
    }
}
