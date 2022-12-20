package org.example;

import org.example.tdas.AllPixels;
import org.example.tdas.Image;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Image img = new Image(2, 2 , new ArrayList<>());
        VentanaPrincipal v1 = new VentanaPrincipal();
        System.out.println("BIENVENIDO AL MEJOR PROGRAMA PARA EDITAR IMAGENES DEL MUNDO");
        System.out.println("Favor escoja como continuar:");
        System.out.println("1. Interactuar por la terminal cmd (aqui se pueden aplicar los requerimiento funcionales).");
        System.out.println("2. Interactuar por la interfaz grafica (esta por el momento solo permite crear imagen tipo bit).");
        System.out.println("3. Cerrar el programa.");
        System.out.println(" ");
        System.out.println("nota: usted podra interactuar por un lapso de maximo 5 min en el sistema.");
        System.out.println(" ");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
        switch (opcion){
            case 1:
                System.out.println("MENU INTERACTIVO POP TERMINARL:");
                System.out.println("Escoja alguna opcion para continuar (recuerde que si aun no crea su imagen debe comenzar por el paso 1).");
                System.out.println("1. Crear una imagen");
                System.out.println("2. Modificar una imagen");
                System.out.println("3. Visualizar imagen");
                System.out.println("4. Salir");
                List<AllPixels> pixels = new ArrayList<>();
                Scanner entradaOp1 = new Scanner(System.in);
                int opcion1 = entrada.nextInt();
                int validate = 1;
                while (validate == 1) {
                    if (opcion1 == 1) {
                        System.out.println("CREAR IMAGEN");
                        System.out.println("Ingrese el tipo imagen que dea crear:");
                        System.out.println("1. Crear una imagen con pixeles tipo Bit.");
                        System.out.println("2. Crear una imagen con pixeles tipo Hexadecimales.");
                        System.out.println("3. Crear una imagen con pixeles tipo RGB.");
                        int tipoPixel = entrada.nextInt();
                        System.out.println("Ingrese largo de la imagen");
                        int largo = entrada.nextInt();
                        System.out.println("Ingrese ancho de la imagen");
                        int ancho = entrada.nextInt();
                        int cantidadpixeles = largo * ancho;

                        for (int i = 0; i < cantidadpixeles; i++) {
                            System.out.println("Ingrese el valor de la coordenada x");
                            int x = entrada.nextInt();
                            System.out.println("Ingrese el valor de la coordenada y");
                            int y = entrada.nextInt();
                            if (tipoPixel == 1) {
                                System.out.println("ingrese el el valor del BIT");
                                int bit = entrada.nextInt();
                                System.out.println("ingrese la profundidad D");
                                int d = entrada.nextInt();
                                AllPixels pixelBIT = new AllPixels(x, y, d, bit, -999, -999, -999, "", tipoPixel);
                                pixels.add(pixelBIT);
                            }
                            if (tipoPixel == 2) {
                                System.out.println("ingrese el valor del hex");
                                String hex = entrada.nextLine();
                                System.out.println("ingrese la profundidad D");
                                int d1 = entrada.nextInt();
                                AllPixels pixelHEX = new AllPixels(x, y, d1, -999, -999, -999, -999, hex, tipoPixel);
                                pixels.add(pixelHEX);
                            }
                            if (tipoPixel == 3) {
                                System.out.println("ingrese el valor de R");
                                int r = entrada.nextInt();
                                System.out.println("ingrese el valor de G");
                                int g = entrada.nextInt();
                                System.out.println("ingrese el valor de B");
                                int b = entrada.nextInt();
                                System.out.println("ingrese la profundidad D");
                                int d2 = entrada.nextInt();
                                AllPixels pixelRGB = new AllPixels(x, y, d2, -999, r, g, b, "", tipoPixel);
                                pixels.add(pixelRGB);
                            }
                        }
                        img = new Image(ancho, largo, pixels);
                        System.out.println(img);
                        Thread.sleep(3000);
                        opcion1 = 2;

                        //break;
                    }
                    if (opcion1 == 2) {
                        System.out.println("MENU PARA INTERACTUAR CON LA IMAGEN CREADA");
                        System.out.println("ingrese el tipo de modificacion que desea hacer.");
                        System.out.println("1. Crear nueva imagen");
                        System.out.println("2. Imprimir imagen");
                        System.out.println("3. Verificar si una imagen es de tipo BIT (IsBitmap)");
                        System.out.println("4. Verificar si una imagen es de tipo HEX (IsHexmap)");
                        System.out.println("5. Verificar si una imagen es de tipo RGB (IsPixmap)");
                        System.out.println("6. Verificar si una imagen esta comprimida (IsCompress)");
                        System.out.println("7. Recortar una imagen en un cuadrante (Crop)");
                        System.out.println("8. Girar una imagen horizontalmente (ImageFlipH)");
                        System.out.println("9. Girar una imagen verticalmente (ImageFlipV)");
                        System.out.println("10. Cambiar una imagen RGB a Hexadecimal (imgRGBToHex)");
                        System.out.println("11. Rotar imagen 90 grados");
                        System.out.println("12. Cerrar el Programa");


                        int opcionimg = entrada.nextInt();
                        if (opcionimg == 1) {
                            opcion1 = 1;
                        }

                        if (opcionimg == 2) {
                            System.out.println(img);
                            System.out.println(" ");
                            System.out.println("En 5 segundos volvera al menu.");
                            Thread.sleep(5000);
                        }
                        if (opcionimg == 3) {
                            if (img.isBitmap()) {
                                System.out.println("La imagen es de tipo bit");
                            } else {
                                System.out.println("La imagen NO es de tipo bit");
                            }
                            System.out.println("En 5 segundos volvera al menu.");
                            Thread.sleep(5000);
                        }
                        if (opcionimg == 4) {
                            if (img.isHexmap()) {
                                System.out.println("La imagen es de tipo Hex");
                            } else {
                                System.out.println("La imagen NO es de tipo Hex");
                            }
                            System.out.println("En 5 segundos volvera al menu.");
                            Thread.sleep(5000);
                        }
                        if (opcionimg == 5) {
                            if (img.isPixmap()) {
                                System.out.println("La imagen es de tipo Pixmap o RGB");
                            } else {
                                System.out.println("La imagen NO es de tipo Pixmap o RGB");
                            }
                            System.out.println("En 5 segundos volvera al menu.");
                            Thread.sleep(5000);
                        }

                        if (opcionimg == 6) {
                            if (img.isCompressed()) {
                                System.out.println("La imagen esta comprimida");
                            } else {
                                System.out.println("La imagen no esta comprimida");
                            }
                            System.out.println(" ");
                            System.out.println("En 5 segundos volvera al menu.");
                            Thread.sleep(5000);

                        }

                        if (opcionimg == 7) {
                            System.out.println("ingrese x1");
                            int x1 = entrada.nextInt();
                            System.out.println("ingrese y1");
                            int y1 = entrada.nextInt();
                            System.out.println("ingrese x2");
                            int x2 = entrada.nextInt();
                            System.out.println("ingrese y2");
                            int y2 = entrada.nextInt();

                            img.crop(x1, y1, x2, y2);
                            System.out.println(img);
                            System.out.println(" ");
                            System.out.println("En 5 segundos volvera al menu.");
                            Thread.sleep(5000);
                        }

                        if (opcionimg == 8) {
                            img.imageFlipH();
                            System.out.println(img);
                            System.out.println(" ");
                            System.out.println("En 5 segundos volvera al menu.");
                            Thread.sleep(5000);
                        }

                        if (opcionimg == 9) {
                            img.imageFlipV();
                            System.out.println(img);
                            System.out.println(" ");
                            System.out.println("En 5 segundos volvera al menu.");
                            Thread.sleep(5000);
                        }

                        if (opcionimg == 10) {
                            img.imgRGBToHex();
                            System.out.println(" ");
                            System.out.println("En 5 segundos volvera al menu.");
                            Thread.sleep(5000);
                        }
                        if (opcionimg == 11) {
                            img.imageRotate90();
                            System.out.println(" ");
                            System.out.println("En 5 segundos volvera al menu.");
                            Thread.sleep(5000);
                        }

                        if (opcionimg == 12) {
                            System.exit(0);
                        }
                    }

                    if (opcion1 == 3) {
                        System.out.println(img);
                        System.out.println(" ");
                        System.out.println("En 5 segundos volvera al menu.");
                        Thread.sleep(5000);
                        opcion1 = 2;
                    }

                    if (opcion1 == 4) {
                        System.exit(0);
                        Thread.sleep(5000);
                    }
                }
                Thread.sleep(300000);
            case 2:
                v1.setVisible(true);
                System.out.println("Menu Principal");
                Thread.sleep(300000);
            case 3:
                System.exit(0);
            default:
                System.out.println("ingrese una opcion valida");
        }
    }
}
