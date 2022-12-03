package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCrearImagen extends JFrame{
    public JPanel panel;
    VentanaImage v3;
    public VentanaCrearImagen(){
        this.setSize(600,600); //Tamaño Ventana
        setLocationRelativeTo(null); //Centrar Ventana.
        setTitle("CREAR IMAGEN"); //Titulo Ventana.
        //this.getContentPane().setBackground(Color.GRAY);
        iniciarComponentes();
        //setLocation(100,200); //Posicion de la Ventana.

    }

    private void iniciarComponentes(){
        insertarPaneles();
        insertarEtiquetas();
        insertarBotones();
    }
    private void insertarPaneles (){
        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        this.getContentPane().add(panel); //Se agrega el panel a la ventana.
    }
    private void insertarEtiquetas (){

        JLabel etiquetaTitulo = new JLabel("CREAR IMAGEN", SwingConstants.CENTER);
        etiquetaTitulo.setBounds(50,15, 500,25);
        panel.add(etiquetaTitulo);
        etiquetaTitulo.setForeground(Color.WHITE);
        etiquetaTitulo.setFont(new Font("Roboto", Font.BOLD, 20));


        JLabel etiquetaSubtitulo = new JLabel("Ingrese al tipo de imagen que desea crear", SwingConstants.CENTER);
        etiquetaSubtitulo.setBounds(50,170, 500,25);
        panel.add(etiquetaSubtitulo);
        etiquetaSubtitulo.setForeground(Color.YELLOW);
        etiquetaSubtitulo.setFont(new Font("Roboto", Font.PLAIN, 15));
    }
    private void insertarBotones(){
        JButton boton1 = new JButton();
        boton1.setText("Crear Imagen tipo BIT");
        boton1.setOpaque(true);
        boton1.setBackground(Color.ORANGE);
        boton1.setBounds(150,200, 300,40);
        panel.add(boton1);
        ActionListener crearImagentipoBit = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v3 = new VentanaImage(1);
                v3.setVisible(true);
                dispose();
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton1.addActionListener(crearImagentipoBit);

        JButton boton2 = new JButton();
        boton2.setText("Crear Imagen tipo HEX");
        boton2.setOpaque(true);
        boton2.setBackground(Color.ORANGE);
        boton2.setBounds(150,250, 300,40);
        panel.add(boton2);

        JButton boton3 = new JButton();
        boton3.setText("Crear Imagen tipo RGB");
        boton3.setOpaque(true);
        boton3.setBackground(Color.ORANGE);
        boton3.setBounds(150,300, 300,40);
        panel.add(boton3);
        ActionListener printimagen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton3.addActionListener(printimagen);

        JButton boton4 = new JButton();
        boton4.setText("Volver al Menu Principal");
        boton4.setOpaque(true);
        boton4.setBackground(Color.WHITE);
        boton4.setBounds(150,400, 300,40);
        panel.add(boton4);
        ActionListener volverMenuPrincipal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton4.addActionListener(volverMenuPrincipal);

    }
}
