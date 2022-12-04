package org.example;
import org.example.VentanaPixBit;
import org.example.tdas.Image;
import org.example.tdas.PixelBit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VentanaPrintImage extends JFrame{
    public JPanel panel;
    public int tipo;
    org.example.tdas.Image img;

    public VentanaPrintImage(int tipo, org.example.tdas.Image img){
        this.tipo = tipo;
        this.img = img;
        this.setSize(600,600); //Tamaño Ventana
        setLocationRelativeTo(null); //Centrar Ventana.
        setTitle("IMAGEN CREADA"); //Titulo Ventana.
        //this.getContentPane().setBackground(Color.GRAY);
        iniciarComponentes();
        //setLocation(100,200); //Posicion de la Ventana.
    }

    private void iniciarComponentes(){
        insertarPaneles();
        insertarEtiquetas();
        insertarBotonContinuar();
    }
    private void insertarPaneles (){
        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        this.getContentPane().add(panel); //Se agrega el panel a la ventana.
    }
    private void insertarEtiquetas (){

        int largoPixels = img.getPixels().size();
        int i = 0;

        int xanterior;
        int yanterior;
        int x1 = 0;
        int y1 = 0;

        while(i<largoPixels){
            int coordx=250;
            int coordy=100;
            PixelBit pixel = img.getPixels().get(i);
            xanterior = x1;
            yanterior = y1;
            x1 = pixel.getX();
            y1 = pixel.getY();
            int bit = pixel.getBit();

            if(y1!=yanterior){
                coordx=coordx+50;
            }
            if(x1!=xanterior){
                coordy=coordy+50;
            }

            JLabel etiquetapixel = new JLabel("", SwingConstants.CENTER);
            etiquetapixel.setBounds(coordx, coordy, 50,50);
            etiquetapixel.setOpaque(true);
            if(bit==1){
                etiquetapixel.setBackground(Color.WHITE);
            }else{
                etiquetapixel.setBackground(Color.BLACK);
            }
            panel.add(etiquetapixel);
            i=i+1;
        }

        JLabel etiquetaTitulo = new JLabel("VISUALIZACION DE IMAGEN", SwingConstants.CENTER);
        etiquetaTitulo.setBounds(50,15, 500,25);
        etiquetaTitulo.setForeground(Color.WHITE);
        etiquetaTitulo.setFont(new Font("Roboto", Font.BOLD, 20));
        panel.add(etiquetaTitulo);

        JLabel etiquetalargo = new JLabel("LARGO:"+img.getLargo(), SwingConstants.CENTER);
        etiquetalargo.setBounds(50,40, 500,25);
        etiquetalargo.setForeground(Color.WHITE);
        etiquetalargo.setFont(new Font("Roboto", Font.BOLD, 15));
        panel.add(etiquetalargo);

        JLabel etiquetaancho = new JLabel("ANCHO:"+img.getAncho(), SwingConstants.CENTER);
        etiquetaancho.setBounds(50,65, 500,25);
        etiquetaancho.setForeground(Color.WHITE);
        etiquetaancho.setFont(new Font("Roboto", Font.BOLD, 15));
        panel.add(etiquetaancho);
        /*
        JLabel etiqueta1 = new JLabel("", SwingConstants.CENTER);
        etiqueta1.setBounds(250,100, 50,50);
        etiqueta1.setOpaque(true);
        etiqueta1.setBackground(Color.WHITE);
        panel.add(etiqueta1);

        JLabel etiqueta2 = new JLabel("", SwingConstants.CENTER);
        etiqueta2.setBounds(300,100, 50,50);
        etiqueta2.setOpaque(true);
        etiqueta2.setBackground(Color.BLACK);
        panel.add(etiqueta2);

        JLabel etiqueta3 = new JLabel("", SwingConstants.CENTER);
        etiqueta3.setBounds(250,150, 50,50);
        etiqueta3.setOpaque(true);
        etiqueta3.setBackground(Color.BLACK);
        panel.add(etiqueta3);

        JLabel etiqueta4 = new JLabel("", SwingConstants.CENTER);
        etiqueta4.setBounds(300,150, 50,50);
        etiqueta4.setOpaque(true);
        etiqueta4.setBackground(Color.WHITE);
        panel.add(etiqueta4);

         */

    }
    private void insertarBotonContinuar(){

        JButton boton1 = new JButton();
        boton1.setText("Volver al Menu");
        boton1.setOpaque(true);
        boton1.setBackground(Color.ORANGE);
        boton1.setBounds(150,350, 300,40);
        panel.add(boton1);
        ActionListener volverAlMenu = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                }
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
        };
        boton1.addActionListener(volverAlMenu);
    }

}
