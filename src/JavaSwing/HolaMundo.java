package JavaSwing;
import javax.swing.*;
public class HolaMundo {
    private JPanel panel;
    private JLabel HolaMundoText;
    public static void main(String[] args) {
        JFrame frame = new JFrame("HolaMundo");
        frame.setContentPane(new HolaMundo().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
