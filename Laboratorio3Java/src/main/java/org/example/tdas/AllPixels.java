package org.example.tdas;

public class AllPixels {
    private int x;
    private int y;
    private int d;
    private int bit;
    private int r;
    private int g;
    private int b;
    private String hex;
    private int tipoPixel;

    public AllPixels(int x, int y, int d, int bit, int r, int g, int b, String hex, int tipoPixel) {
        this.r = x;
        this.g = y;
        this.r = d;
        this.bit = bit;
        this.r = r;
        this.g = g;
        this.b = b;
        this.hex = hex;
        this.tipoPixel = tipoPixel;
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

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
    public int getTipoPixel() {
        return tipoPixel;
    }

    public void setTipoPixel(int tipoPixel) {
        this.tipoPixel = tipoPixel;
    }

    public void pixelFlipV(int largo) {
        if (x < largo - 1) {
            x = x + 1;
        } else {
            x = x - 1;
        }
    }

    public void pixelFlipH(int ancho) {
        if (y < ancho - 1) {
            y = y + 1;
        } else {
            y = y - 1;
        }
    }

    public void pixelRotar90(){
        this.x = y;
        this.y = -x;
    }

    public void hexToRGB(){
        int r = getR();
        int g = getG();
        int b = getB();
        setHex(String.format("#%02x%02x%02x", r, g, b));
        tipoPixel = 2;
    }

    @Override
    public String toString() {
        return "Colores{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                ", bit=" + bit +
                ", hex='" + hex + '\'' +
                '}';
    }


}
