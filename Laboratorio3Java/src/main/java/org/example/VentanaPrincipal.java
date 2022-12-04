package org.example;
import org.example.tdas.VentanaPrintImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame{
    public JPanel panel;

    boolean isCreateImage = false;
    VentanaCrearImagen v2;

    public VentanaPrincipal(){
        this.setSize(700,700); //Tamaño Ventana
        setLocationRelativeTo(null); //Centrar Ventana.
        setTitle("GIMPS FRUNA"); //Titulo Ventana.
        //this.getContentPane().setBackground(Color.GRAY);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLocation(100,200); //Posicion de la Ventana.

    }

    private void iniciarComponentes(){
        insertarPaneles();
        insertarEtiquetas();
        insertarBotones();
        //insertarInputs();

    }
    private void insertarPaneles (){
        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        this.getContentPane().add(panel); //Se agrega el panel a la ventana.
    }
    private void insertarEtiquetas (){

        JLabel etiquetaTitulo = new JLabel("BIENVENIDO AL LABORATORIO DE 3 DE JAVA", SwingConstants.CENTER);
        etiquetaTitulo.setBounds(100,15, 500,25);
        panel.add(etiquetaTitulo);
        etiquetaTitulo.setForeground(Color.WHITE);
        etiquetaTitulo.setFont(new Font("Roboto", Font.BOLD, 20));

        JLabel etiquetaImg = new JLabel(new ImageIcon("imagenTitulo.png"));
        panel.add(etiquetaImg);
        etiquetaImg.setBounds(286,70, 128,128);

        JLabel etiquetaSubtitulo = new JLabel("MENU PRINCIPAL", SwingConstants.CENTER);
        etiquetaSubtitulo.setBounds(100,220, 500,25);
        panel.add(etiquetaSubtitulo);
        etiquetaSubtitulo.setForeground(Color.WHITE);
        etiquetaSubtitulo.setFont(new Font("Roboto", Font.PLAIN, 15));
    }
    private void insertarBotones(){
        JButton boton1 = new JButton();
        boton1.setText("Crear Nueva Imagen");
        boton1.setOpaque(true);
        boton1.setBackground(Color.ORANGE);
        boton1.setBounds(200,250, 300,40);
        panel.add(boton1);
        ActionListener crearImagen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v2 = new VentanaCrearImagen();
                v2.setVisible(true);
                isCreateImage = true;
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton1.addActionListener(crearImagen);

        JButton boton2 = new JButton();
        boton2.setText("Imprimir Imagen");
        boton2.setOpaque(true);
        boton2.setBackground(Color.orange);
        boton2.setBounds(200,300, 300,40);
        //if(isCreateImage=false){
        //    boton2.setEnabled(false);
        //    boton2.setBackground(Color.GRAY);
        //}
        panel.add(boton2);
        ActionListener ImprimirImg = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaPrintImage vimg = new VentanaPrintImage(1,v2.v3.img);
                vimg.setVisible(true);
                System.out.println(v2.v3.img.getAncho());
                System.out.println(v2.v3.img.getLargo());
                v2.v3.img.getPixels().forEach(System.out::println);
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton2.addActionListener(ImprimirImg);

        JButton boton3 = new JButton();
        boton3.setText("Finalizar Programa");
        boton3.setOpaque(true);
        boton3.setBackground(Color.WHITE);
        boton3.setBounds(200,350, 300,40);
        panel.add(boton3);
        ActionListener cerrarPrograma = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton3.addActionListener(cerrarPrograma);

    }
    private void insertarInputs() {
        JTextField input1 = new JTextField();
        input1.setBounds(200, 450, 300, 40);
        panel.add(input1);
    }

}
