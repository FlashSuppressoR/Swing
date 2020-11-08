import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;
import javax.swing.*;
import java.awt.*;


public class SimpleAnimation {
    Calendar currentTime = Calendar.getInstance();
    long currentMillis = currentTime.getTimeInMillis();
    long tempMillis = currentMillis + 5000;
    Color currentColor = Color.pink;
    int x = 50;
    int y = 130;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel myPanel = new MyDrawPanel();

        frame.getContentPane().add(myPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);

        while (true){
            for(int i = 0; i < 150; i++){
                x++;
                y++;
                myPanel.repaint();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                }
            }
            for(int i = 0; i < 150; i++){
                x++;
                y--;
                myPanel.repaint();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                }
            }
            for(int i = 0; i < 150; i++){
                x--;
                y++;
                myPanel.repaint();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                }
            }
            for(int i = 0; i < 150; i++){
                x--;
                y--;
                myPanel.repaint();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                }
            }
        }
    }
    class MyDrawPanel extends JPanel{

        public void paintComponent(Graphics g){

            g.setColor(Color.DARK_GRAY);
            g.fillRect(0, 0 , this.getWidth(), this.getHeight());
            currentMillis = Calendar.getInstance().getTimeInMillis();
            if (currentMillis < tempMillis) {
                g.setColor(currentColor);
            }
            else{
                tempMillis += 5000;
                int red = (int) (Math.random() * 255);
                int green = (int) (Math.random() * 255);
                int blue = (int) (Math.random() * 255);
                Color reColor = new Color(red, green, blue);
                currentColor = reColor;
                g.setColor(reColor);
            }
            g.fillOval(x, y, 40, 40);
        }
    }
}
