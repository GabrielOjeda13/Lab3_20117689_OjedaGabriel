package org.example.tdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Image implements ImageOperation {
    private int largo;
    private int ancho;
    List<AllPixels> pixels;

    public Image(int largo, int ancho, List<AllPixels> pixels) {
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

    public List<AllPixels> getPixels() {
        return pixels;
    }

    public void setPixels(List<AllPixels> pixels) {
        this.pixels = pixels;
    }
    public boolean isBitmap(){
        for (AllPixels pixel : pixels) {
            if (!pixel.isPixbit()) {
                return false;
            }
        }
        return true;
    }
    public boolean isPixmap(){
        for (AllPixels pixel : pixels) {
            if (!pixel.isPixRGB()) {
                return false;
            }
        }
        return true;
    }
    public boolean isHexmap(){
        for (AllPixels pixel : pixels) {
            if (!pixel.isPixhex()) {
                return false;
            }
        }
        return true;
    }

    public void crop(int x1, int x2, int y1, int y2){
        List<AllPixels> nuevo = new ArrayList<>();
        for (AllPixels pixel : pixels) {
            if (pixel.getX() >= x1 && pixel.getX() <= x2 && pixel.getY() >= y1 && pixel.getY() <= y2) {
                nuevo.add(pixel);
            }
        }
        this.setPixels(nuevo);
    }

    public boolean isCompressed(){
        if(pixels.size() == ancho * largo){
            return false;
        } else {
            return true;
        }
    }

    public void imageFlipH(){
        getPixels().forEach(pixel -> pixel.pixelFlipH(ancho));
    }

    public void imageFlipV(){
        getPixels().forEach(pixel -> pixel.pixelFlipV(largo));
    }

    public void imgRGBToHex(){
        for (AllPixels pixel : pixels) {
            pixel.hexToRGB();
        }
    }

    public void imageRotate90(){
        getPixels().forEach(pixel -> pixel.pixelRotate90());
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
