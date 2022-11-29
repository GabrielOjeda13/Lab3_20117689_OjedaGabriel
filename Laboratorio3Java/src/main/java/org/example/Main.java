package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("BIENVENIDO AL JUEGO DE LA VIDA\n");
        Menu menu = new Menu();
        menu = menu.MenuPrincipal(menu);
        System.out.print("HASTA PRONTO COMISARIO GOODY\n");
    }
}
