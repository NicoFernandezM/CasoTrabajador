package guis;

import modelo.Trabajador;

import javax.swing.*;

public class VentanaMostrarDatos {
    Trabajador trabajador = new Trabajador();
    JFrame ventanaMostrarDatos = new JFrame();
    JLabel nombre = new JLabel("Nombre: " + trabajador.getNombre());
    JLabel apellido = new JLabel("Apellido: " + trabajador.getApellido());
    JLabel rut = new JLabel("Rut: " + trabajador.getRut());
    JLabel afp = new JLabel("AFP: " + trabajador.getAfp());
    JLabel isapre = new JLabel("Isapre: " + trabajador.getIsapre());

    public VentanaMostrarDatos () {
        ventanaMostrarDatos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaMostrarDatos.setLayout(null);
        ventanaMostrarDatos.setSize(500,500);
        ventanaMostrarDatos.setVisible(true);

        nombre.setBounds(50,100,200,25);
        apellido.setBounds(50,150,200,25);
        rut.setBounds(50,200,200,25);
        afp.setBounds(50,250,200,25);
        isapre.setBounds(50,300,200,25);

        ventanaMostrarDatos.add(nombre);
        ventanaMostrarDatos.add(apellido);
        ventanaMostrarDatos.add(rut);
        ventanaMostrarDatos.add(afp);
        ventanaMostrarDatos.add(isapre);
    }
}
