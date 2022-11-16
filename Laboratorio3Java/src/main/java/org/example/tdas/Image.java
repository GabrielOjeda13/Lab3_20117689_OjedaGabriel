package org.example.tdas;

import java.util.List;

public class Image {
    int largo;
    int ancho;
    List<pixeles> pixeles;

    public Image(int largo, int ancho, List<pixeles> pixeles) {
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

    public List<pixeles> getPixeles() {
        return pixeles;
    }

    public void setPixeles(List<pixeles> pixeles) {
        this.pixeles = pixeles;
    }
}
