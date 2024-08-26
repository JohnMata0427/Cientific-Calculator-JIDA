import javax.swing.*;
import java.awt.geom.RoundRectangle2D;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new form1().calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(475, 575);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setShape(new RoundRectangle2D.Double(0, 0, 475, 575, 15, 15));
    }
}