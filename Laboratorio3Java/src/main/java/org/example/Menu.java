package org.example;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    public Menu MenuPrincipal(Menu menu){
        System.out.println("Menu Principal");
        int seleccion = 0;
        do {
            System.out.print("1. Crear una Imagen Tipo BIT \n");
            System.out.print("2. Crear una Imagen Tipo HEX \n");
            System.out.print("3. Crear una Imagen Tipo RGB \n");
            System.out.print("4. Cerrar el Programa \n");
            seleccion = teclado.nextInt();
            switch(seleccion) {
                case 1:
                    return menu.SubMenu(menu);
                case 2:
                    return menu.SubMenu(menu);
                case 3:
                    return menu.SubMenu(menu);
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
    public Menu SubMenu(Menu menu){
        System.out.println("Menu Secundario");
        int seleccion = 0;
        do {
            System.out.print("1. Rotar Imagen \n");
            System.out.print("2. Histograma \n");
            System.out.print("3. Rotate 90 \n");
            System.out.print("4. Volver a Crear una Imagen Nueva \n");
            seleccion = teclado.nextInt();
            switch(seleccion) {
                case 1:
                    return menu.SubMenu(menu);
                case 2:
                    return menu.SubMenu(menu);
                case 3:
                    return menu.SubMenu(menu);
                case 4:
                    return menu.MenuPrincipal(menu);
                default:
                    System.out.println("Error, Seleccion Invalida");
            }
        }while(seleccion != 4);
        return menu;
    }
}
