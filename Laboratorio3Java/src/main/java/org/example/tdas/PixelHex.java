package org.example.tdas;

public class PixelHex {
    int x;
    int y;
    int d;
    String hex;

    public PixelHex(int x, int y, int d, String hex) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.hex = hex;
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

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    @Override
    public String toString() {
        return "PixelHex{" +
                "hex='" + hex + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", d=" + d +
                '}';
    }
}
