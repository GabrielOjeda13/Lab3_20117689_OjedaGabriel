package org.example.tdas;

import java.util.List;

public class Image implements ImageOperation {
    int largo;
    int ancho;
    List<Pixel> pixeles;

    public Image(int largo, int ancho, List<Pixel> pixeles) {
        this.largo = largo;
        this.ancho = ancho;
        this.pixeles = pixeles;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public List<Pixel> getPixeles() {
        return pixeles;
    }

    public void setPixeles(List<Pixel> pixeles) {
        this.pixeles = pixeles;
    }
}
