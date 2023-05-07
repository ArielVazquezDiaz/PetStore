package JavaSwing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickBoton extends JFrame{
    private JPanel Panel;
    private JButton ClickBoton;
    private JLabel EtiquetaHola;
    public ClickBoton() {
        ClickBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EtiquetaHola.setText("Hola Mundo");
            }
        });
        setContentPane(Panel);
        setTitle("Hola Mundo");
        setVisible(true);
    }
    public static void main(String[] args) {
        ClickBoton holaMundo = new ClickBoton();
    }

}
