package guis;
import modelo.Trabajador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaTrabajador implements ActionListener {
    JFrame ventanaTrabajador = new JFrame();
    JButton mostrarDatos = new JButton("Mostrar datos.");
    JButton modificarDatos = new JButton("Modificar datos.");

    public VentanaTrabajador() {
        ventanaTrabajador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaTrabajador.setLayout(null);
        ventanaTrabajador.setSize(500, 500);
        ventanaTrabajador.setVisible(true);
        JLabel tituloTrabajador = new JLabel("Trabajador");

        tituloTrabajador.setBounds(220,100,125,50);
        mostrarDatos.setBounds(125,200,130,50);
        mostrarDatos.addActionListener(this);
        modificarDatos.setBounds(250,200,130,50);
        modificarDatos.addActionListener(this);

        ventanaTrabajador.add(mostrarDatos);
        ventanaTrabajador.add(modificarDatos);
        ventanaTrabajador.add(tituloTrabajador);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ventanaTrabajador.dispose();

        if(e.getSource() == mostrarDatos) {
            VentanaMostrarDatos ventanaMostrarDatos = new VentanaMostrarDatos();
        }else {
            VentanaModificarDatos ventanaModificarDatos = new VentanaModificarDatos();
        }
    }
}