package org.example.tdas;

import java.util.List;
import java.util.stream.Collectors;

public class Image implements ImageOperation {
    int largo;
    int ancho;
    List<Pixel> pixels;

    public Image(int largo, int ancho, List<Pixel> pixels) {
        this.largo = largo;
        this.ancho = ancho;
        this.pixels = pixels;
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

    public List<Pixel> getPixels() {
        return pixels;
    }

    public void setPixels(List<Pixel> pixels) {
        this.pixels = pixels;
    }

    public void crop(int x1, int x2, int y1, int y2){
        List<Pixel> filteredPixels =
                pixels.stream()
                        .filter(pixel -> pixel.getX() > x1 &&
                                pixel.getY() > y1)
                        .collect(Collectors.toList());
        this.pixels = filteredPixels;
    }

    @Override
    public String toString() {
        return "Image{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", pixeles=" + pixels +
                '}';
    }
}
