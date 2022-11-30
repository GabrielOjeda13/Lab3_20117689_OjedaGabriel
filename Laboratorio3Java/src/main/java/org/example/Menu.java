package org.example;
import org.example.tdas.Image;
import org.example.tdas.Pixel;
import org.example.tdas.PixelBit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    public Menu MenuPrincipal(Menu menu){
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

                    return menu.SubMenu(menu, image);
                case 2:
                    //return menu.SubMenu(menu, image);
                case 3:
                    //return menu.SubMenu(menu, image);
                case 4:
                    System.out.println("Bye.. Que la Fuerza te acompañe");
                    //System.exit(0);
                    return menu;
                default:
                    System.out.println("Error, Seleccion Invalida");
                }
            }while(seleccion != 4);
            return menu;
        }//termino del menu principal
    public Menu SubMenu(Menu menu, Image image){
        System.out.println("Menu Secundario");
        int seleccion = 0;
        do {
            System.out.print("1. Rotar Imagen \n");
            System.out.print("2. Histograma \n");
            System.out.print("3. Imprimir imagen \n");
            System.out.print("4. Volver a Crear una Imagen Nueva \n");
            seleccion = input.nextInt();
            switch(seleccion) {
                case 1:
                    //return menu.SubMenu(menu, image);
                case 2:
                    System.out.println("Ingrese un número int para la coordenada X en donde quiera recortar la imagen:");
                    int x = input.nextInt();
                    System.out.println("Ingrese otro número int para la coordenada Y X en donde quiera recortar la imagen:");
                    int y = input.nextInt();
                    int alt = image.getLargo();
                    int anch = image.getAncho();
                    image.crop(x,alt,y,anch);
                    //return menu.SubMenu(menu, image);
                case 3:
                    int alto = image.getLargo();
                    List<Pixel> pixels = image.getPixels();
                    pixels.forEach(System.out::println);
                    return menu.SubMenu(menu, image);
                case 4:
                    return menu.MenuPrincipal(menu);
                default:
                    System.out.println("Error, Seleccion Invalida");
            }
        }while(seleccion != 4);
        return menu;
    }
}
