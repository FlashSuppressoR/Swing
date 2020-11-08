import javax.swing.*;
import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        TestFrame tFrame = new TestFrame();
        tFrame.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("Shock me!");
        JButton button2 = new JButton("bliss");
        JButton button3 = new JButton("Do it!");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
