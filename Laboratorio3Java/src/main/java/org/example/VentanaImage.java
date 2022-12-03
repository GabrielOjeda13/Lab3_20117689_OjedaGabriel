package org.example;
import org.example.tdas.Image;
import org.example.tdas.Pixel;
import org.example.tdas.PixelBit;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VentanaImage extends JFrame{
    public JPanel panel;
    public int tipo;
    JFormattedTextField  input1;
    JFormattedTextField  input2;
    Image img;

    VentanaPixBit ventanaImg;

    public VentanaImage(int tipo){
        this.tipo = tipo;
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
        insertarBotonContinuar();
        insertarInputs();
    }
    private void insertarPaneles (){
        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        this.getContentPane().add(panel); //Se agrega el panel a la ventana.
    }
    private void insertarEtiquetas (){

        JLabel etiquetaTitulo = new JLabel("CREAR IMAGEN TIPO BIT", SwingConstants.CENTER);
        etiquetaTitulo.setBounds(50,15, 500,25);
        panel.add(etiquetaTitulo);
        etiquetaTitulo.setForeground(Color.WHITE);
        etiquetaTitulo.setFont(new Font("Roboto", Font.BOLD, 20));

        JLabel etiquetaLargo = new JLabel("Ingrese el Largo de la imagen", SwingConstants.CENTER);
        etiquetaLargo.setBounds(50,120, 500,25);
        panel.add(etiquetaLargo);
        etiquetaLargo.setForeground(Color.YELLOW);
        etiquetaLargo.setFont(new Font("Roboto", Font.PLAIN, 15));

        JLabel etiquetaAncho = new JLabel("Ingrese el Largo de la imagen", SwingConstants.CENTER);
        etiquetaAncho.setBounds(150,200, 300,40);
        panel.add(etiquetaAncho);
        etiquetaAncho.setForeground(Color.YELLOW);
        etiquetaAncho.setFont(new Font("Roboto", Font.PLAIN, 15));
    }
    private void insertarBotonContinuar(){

        JButton boton1 = new JButton();
        boton1.setText("Continuar");
        boton1.setOpaque(true);
        boton1.setBackground(Color.ORANGE);
        boton1.setBounds(150,350, 300,40);
        panel.add(boton1);
        ActionListener registrarImagen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tipo == 1){
                    int largoimg = Integer.parseInt(input1.getText());
                    int anchoimg = Integer.parseInt(input2.getText());
                    int largoListPixels = largoimg*anchoimg;
                    List<Pixel> pixels = new ArrayList<>();
                    dispose();
                    int contador = 1;
                    img = new Image(largoimg, anchoimg, pixels);
                    while(contador <= largoListPixels){
                        ventanaImg = new VentanaPixBit(contador, img);
                        ventanaImg.setVisible(true);
                        contador=contador+1;
                    }
                }
                //setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        };
        boton1.addActionListener(registrarImagen);

    }

    private void insertarInputs() {
        input1 = new JFormattedTextField(new Integer(2));
        input1.setBounds(150,150, 300,40);
        panel.add(input1);

        input2 = new JFormattedTextField (new Integer(2));
        input2.setBounds(150,250, 300,40);
        panel.add(input2);
    }


}
