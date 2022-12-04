package org.example.tdas;

public class PixelRGB {
    int x;
    int y;
    int d;
    int r;
    int g;
    int b;

    public PixelRGB(int x, int y, int d, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.r = r;
        this.g = g;
        this.b = b;
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
