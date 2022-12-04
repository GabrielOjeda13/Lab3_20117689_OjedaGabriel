package org.example;
import org.example.tdas.Image;
import org.example.tdas.PixelBit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPixBit extends JFrame{
    public JPanel panel;
    JFormattedTextField  inputX;
    JFormattedTextField  inputY;
    JFormattedTextField  inputbit;
    JFormattedTextField  inputD;
    int n;
    org.example.tdas.Image imagen;

    PixelBit pixelBit;
    public VentanaPixBit(int n, org.example.tdas.Image img){
        this.n = n;
        this.imagen = img;
        this.setSize(600,800); //Tamaño Ventana
        setLocationRelativeTo(null); //Centrar Ventana.
        setTitle("CREAR PIXEL BIT"); //Titulo Ventana.
        //this.getContentPane().setBackground(Color.GRAY);
        iniciarComponentes();
        //setLocation(100,200); //Posicion de la Ventana.

    }
    private void iniciarComponentes(){
        insertarPaneles();
        insertarEtiquetas();
        insertarBotones();
        insertarInputs();
    }
    private void insertarPaneles (){
        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        this.getContentPane().add(panel); //Se agrega el panel a la ventana.
    }
    private void insertarEtiquetas (){

        JLabel etiquetaTitulo = new JLabel("CREAR PIXEL BIT NUMERO: "+n, SwingConstants.CENTER);
        etiquetaTitulo.setBounds(50,15, 500,25);
        panel.add(etiquetaTitulo);
        etiquetaTitulo.setForeground(Color.WHITE);
        etiquetaTitulo.setFont(new Font("Roboto", Font.BOLD, 20));

        JLabel etiquetaX = new JLabel("Ingrese un Entero para la coordenada X del pixel bit", SwingConstants.CENTER);
        etiquetaX.setBounds(50,120, 500,25);
        panel.add(etiquetaX);
        etiquetaX.setForeground(Color.YELLOW);
        etiquetaX.setFont(new Font("Roboto", Font.PLAIN, 15));

        JLabel etiquetaY = new JLabel("Ingrese un Entero para la coordenada Y del pixel bit", SwingConstants.CENTER);
        etiquetaY.setBounds(50,200, 500,40);
        panel.add(etiquetaY);
        etiquetaY.setForeground(Color.YELLOW);
        etiquetaY.setFont(new Font("Roboto", Font.PLAIN, 15));

        JLabel etiquetabit = new JLabel("Ingrese un Entero para el valor del BIT del pixel bit (0 o 1)", SwingConstants.CENTER);
        etiquetabit.setBounds(50,280, 500,40);
        panel.add(etiquetabit);
        etiquetabit.setForeground(Color.YELLOW);
        etiquetabit.setFont(new Font("Roboto", Font.PLAIN, 15));

        JLabel etiquetaD = new JLabel("Ingrese un Entero para la Profundidad D del pixel bit", SwingConstants.CENTER);
        etiquetaD.setBounds(50,380, 500,40);
        panel.add(etiquetaD);
        etiquetaD.setForeground(Color.YELLOW);
        etiquetaD.setFont(new Font("Roboto", Font.PLAIN, 15));
    }
    public void insertarBotones(){
        JButton boton1 = new JButton();
        boton1.setText("CREAR PIXEL");
        boton1.setOpaque(true);
        boton1.setBackground(Color.ORANGE);
        boton1.setBounds(150,550, 300,40);
        panel.add(boton1);
        ActionListener CrearPixbit = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(inputX.getText());
                int y = Integer.parseInt(inputY.getText());
                int bit = Integer.parseInt(inputbit.getText());
                int d = Integer.parseInt(inputD.getText());
                pixelBit = new PixelBit(x, y, d, bit);
                imagen.getPixels().add(pixelBit);
                dispose();
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton1.addActionListener(CrearPixbit);
    }

    private void insertarInputs() {
        inputX = new JFormattedTextField();
        inputX.setBounds(270,150, 60,40);
        panel.add(inputX);

        inputY = new JFormattedTextField ();
        inputY.setBounds(270,250, 60,40);
        panel.add(inputY);

        inputbit = new JFormattedTextField();
        inputbit.setBounds(270,350, 60,40);
        panel.add(inputbit);

        inputD = new JFormattedTextField ();
        inputD.setBounds(270,450, 60,40);
        panel.add(inputD);
    }
}
