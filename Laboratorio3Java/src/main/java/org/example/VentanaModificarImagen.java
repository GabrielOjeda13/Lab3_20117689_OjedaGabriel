package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaModificarImagen extends JFrame{
    public JPanel panel;
    org.example.tdas.Image imgmod;
    public VentanaModificarImagen(org.example.tdas.Image img){
        this.imgmod = img;
        this.setSize(600,600); //Tamaño Ventana
        setLocationRelativeTo(null); //Centrar Ventana.
        setTitle("MODIFICAR IMAGEN"); //Titulo Ventana.
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

        JLabel etiquetaTitulo = new JLabel("MODIFICAR IMAGEN", SwingConstants.CENTER);
        etiquetaTitulo.setBounds(50,15, 500,25);
        panel.add(etiquetaTitulo);
        etiquetaTitulo.setForeground(Color.WHITE);
        etiquetaTitulo.setFont(new Font("Roboto", Font.BOLD, 20));

        JLabel etiquetaSubtitulo = new JLabel("Recuerde crear primeramente su Imagen en el Menu Principal", SwingConstants.CENTER);
        etiquetaSubtitulo.setBounds(0,170, 600,20);
        panel.add(etiquetaSubtitulo);
        etiquetaSubtitulo.setForeground(Color.YELLOW);
        etiquetaSubtitulo.setFont(new Font("Roboto", Font.PLAIN, 10));
    }
    private void insertarBotones(){

        JButton boton1 = new JButton();
        boton1.setText("Imprimir Imagen");
        boton1.setOpaque(true);
        boton1.setBackground(Color.ORANGE);
        boton1.setBounds(150,200, 300,40);
        panel.add(boton1);
        ActionListener ImprimirImgmod = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaPrintImage vimg = new VentanaPrintImage(1,imgmod);
                vimg.setVisible(true);
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton1.addActionListener(ImprimirImgmod);

        JButton boton2 = new JButton();
        boton2.setText("Crop() de mi Imagen");
        boton2.setOpaque(true);
        boton2.setBackground(Color.ORANGE);
        boton2.setBounds(150,250, 300,40);
        panel.add(boton2);
        ActionListener cropImagen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton2.addActionListener(cropImagen);

        JButton boton3 = new JButton();
        boton3.setText("IsCompres()? mi Imagen");
        boton3.setOpaque(true);
        boton3.setBackground(Color.ORANGE);
        boton3.setBounds(150,300, 300,40);
        panel.add(boton3);
        ActionListener isCompressImg = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton3.addActionListener(isCompressImg);

        JButton boton4 = new JButton();
        boton4.setText("Utilizar Otros Metodos");
        boton4.setOpaque(true);
        boton4.setEnabled(false);
        boton4.setBackground(Color.GRAY);
        boton4.setBounds(150,350, 300,40);
        panel.add(boton4);

        JButton boton5 = new JButton();
        boton5.setText("Volver al Menu Principal");
        boton5.setOpaque(true);
        boton5.setBackground(Color.WHITE);
        boton5.setBounds(150,450, 300,40);
        panel.add(boton5);
        ActionListener volverMenuPrincipal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton5.addActionListener(volverMenuPrincipal);

    }
}
