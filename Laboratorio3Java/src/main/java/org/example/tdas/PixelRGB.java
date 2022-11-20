package org.example.tdas;

public class PixelRGB extends Pixel {

    int r;
    int g;
    int b;

    public PixelRGB(int x, int y, int d, int r, int g, int b) {
        super(x, y, d);
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "PixelRGB{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                ", x=" + x +
                ", y=" + y +
                ", d=" + d +
                '}';
    }
}
