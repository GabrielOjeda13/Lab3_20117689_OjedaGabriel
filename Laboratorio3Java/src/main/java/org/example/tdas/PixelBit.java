package org.example.tdas;

public class PixelBit extends Pixel {

    int bit;

    public PixelBit(int x, int y, int d, int bit) {
        super(x, y, d);
        this.bit = bit;
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
