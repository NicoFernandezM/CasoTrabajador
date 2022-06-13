package guis;
import modelo.Trabajador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaModificarDatos implements ActionListener {
    Trabajador trabajador = new Trabajador();
    JFrame ventanaModificarDatos = new JFrame();
    JLabel nombre = new JLabel("Nombre: " + trabajador.getNombre());
    JLabel apellido = new JLabel("Apellido: " + trabajador.getApellido());
    JLabel rut = new JLabel("Rut: " + trabajador.getRut());
    JLabel afp = new JLabel("AFP: ");
    JLabel isapre = new JLabel("Isapre: ");
    JTextField afpField = new JTextField();
    JTextField isapreField = new JTextField();
    JButton aceptar = new JButton("Aceptar");
    JButton cancelar = new JButton("Cancelar");

    public VentanaModificarDatos() {
        ventanaModificarDatos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaModificarDatos.setLayout(null);
        ventanaModificarDatos.setSize(500,500);
        ventanaModificarDatos.setVisible(true);

        nombre.setBounds(50,100,200,25);
        apellido.setBounds(50,150,200,25);
        rut.setBounds(50,200,200,25);
        afp.setBounds(50,250,75,25);
        isapre.setBounds(50,300,75,25);

        afpField.setBounds(125,250,200,25);
        isapreField.setBounds(125,300,200,25);

        aceptar.setBounds(125,350,100,25);
        aceptar.addActionListener(this);
        cancelar.setBounds(225,350,100,25);
        cancelar.addActionListener(this);

        ventanaModificarDatos.add(nombre);
        ventanaModificarDatos.add(apellido);
        ventanaModificarDatos.add(rut);
        ventanaModificarDatos.add(afp);
        ventanaModificarDatos.add(isapre);
        ventanaModificarDatos.add(afpField);
        ventanaModificarDatos.add(isapreField);
        ventanaModificarDatos.add(aceptar);
        ventanaModificarDatos.add(cancelar);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == aceptar) {
            Trabajador.setAfp(afpField.getText());
            Trabajador.setIsapre(isapreField.getText());
            ventanaModificarDatos.dispose();
        } else {
            ventanaModificarDatos.dispose();
        }

        VentanaTrabajador ventanaTrabajador = new VentanaTrabajador();

    }
}
