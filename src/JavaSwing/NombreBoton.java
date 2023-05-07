package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NombreBoton extends JFrame{
    private JPanel Panel;
    private JButton boton1;
    private JTextField PonerNombre;
    private JLabel MostrarTexto;

    public NombreBoton() {
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=PonerNombre.getText();
                MostrarTexto.setText("Hola "+name);
            }
        });
        setContentPane(Panel);
        setTitle("Hola Usuario");
        setVisible(true);
    }
    public static void main(String[] args) {
        NombreBoton holaUsuario = new NombreBoton();
    }

}
