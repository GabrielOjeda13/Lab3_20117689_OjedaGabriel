package org.example.tdas;

public class PixelHex extends Pixel{

    String hex;

    public PixelHex(int x, int y, int d, String hex) {
        super(x, y, d);
        this.hex = hex;
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
