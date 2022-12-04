package org.example;
import org.example.tdas.Image;
import org.example.tdas.Pixel;
import org.example.tdas.PixelBit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VentanaPrincipal v1 = new VentanaPrincipal();
        v1.setVisible(true);

        Scanner input = new Scanner(System.in);
        System.out.println("Menu Principal");
        int seleccion = 0;
        do {
            System.out.print("1. Crear una Imagen Tipo BIT \n");
            System.out.print("2. Crear una Imagen Tipo HEX \n");
            System.out.print("3. Crear una Imagen Tipo RGB \n");
            System.out.print("4. Cerrar el Programa \n");
            seleccion = input.nextInt();
            switch(seleccion) {
                case 1:
                    /*
                    System.out.println("CREANDO IMAGEN TIPO BIT\n");
                    System.out.println("Ingrese un número int para el ALTO de la Imagen y luego presione ENTER:");
                    int altoimg = input.nextInt();
                    System.out.println("Ingrese otro número int para el ANCHO de la Imagen y luego presione ENTER:");
                    int anchoimg = input.nextInt();
                    int largoListPixels = altoimg*anchoimg;
                    System.out.println("Dado el Alto y Ancho ustede debe registrar una lista de \n" + largoListPixels);
                    List<Pixel> pixels = new ArrayList<>();
                    int contador = 1;
                    while(contador <= largoListPixels){
                        System.out.println("Pixel número: " + contador);
                        System.out.println("Ingrese un número int para la coordenada X del Pixel y luego presione ENTER:");
                        int x = input.nextInt();
                        System.out.println("Ingrese otro número int para la coordenada Y del Pixel  y luego presione ENTER:");
                        int y = input.nextInt();
                        System.out.println("Ingrese un número int para el BIT (0 o 1) del Pixel y luego presione ENTER:");
                        int bit = input.nextInt();
                        System.out.println("Ingrese otro número int para la profundidad D del Pixel  y luego presione ENTER:");
                        int d = input.nextInt();
                        PixelBit pixelBit = new PixelBit(x, y, d, bit);
                        pixels.add(pixelBit);
                        contador = contador + 1;
                    }
                    var image = new Image(altoimg, anchoimg, pixels);
                    */
                    List<PixelBit> pixels = new ArrayList<>();
                    //pixels.add(new PixelBit(0,0, 0, 3));
                    //pixels.add(new PixelBit(1,0, 1, 32));
                    //pixels.add(new PixelBit(0,1, 1, 323));
                    //pixels.add(new PixelBit(1,1, 0, 3));
                    var image = new Image(2, 2, pixels);

                    System.out.println("Menu Secundario");
                    int seleccion2 = 0;
                    do {
                        System.out.print("1. Rotar Imagen \n");
                        System.out.print("2. Recortar Imagaen \n");
                        System.out.print("3. Imprimir imagen \n");
                        System.out.print("4. Volver a Crear una Imagen Nueva \n");
                        seleccion2 = input.nextInt();
                        switch(seleccion2) {
                            case 1:
                                //return menu.SubMenu(menu, image);
                            case 2:
                                System.out.println("Ingrese un número int para la coordenada X en donde quiera recortar la imagen:");
                                int x = input.nextInt();
                                System.out.println("Ingrese otro número int para la coordenada Y X en donde quiera recortar la imagen:");
                                int y = input.nextInt();
                                int alt = image.getLargo();
                                int anch = image.getAncho();
                                //image.crop(x,alt,y,anch);
                                //return menu.SubMenu(menu, image);
                            case 3:
                                pixels.forEach(System.out::println);
                                //return menu.SubMenu(menu, image);
                            case 4:
                                seleccion = 4;
                                //return menu.MenuPrincipal(menu);
                            default:
                                //System.out.println("Error, Seleccion Invalida");
                        }
                    }while(seleccion2 != 4);
                case 2:
                    //return menu.SubMenu(menu, image);
                case 3:
                    //return menu.SubMenu(menu, image);
                case 4:
                    System.out.println("Bye.. Que la Fuerza te acompañe");
                    System.exit(0);
                default:
                    System.out.println("Error, Seleccion Invalida");
            }
        }while(seleccion != 4);
        System.exit(0);
    }
}
