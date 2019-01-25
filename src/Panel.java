import javax.swing.*;
import java.awt.*;

public class Panel {
    public Panel(){
        JFrame frame = new JFrame("Panel");
        JPanel panel = new JPanel();
         panel.setBounds(40,80,200,200);
          panel.setBackground(Color.lightGray);
          JButton b1 = new JButton(" ");
          b1.setBounds(25,50,40,20);
          b1.setBackground(Color.CYAN);
          JButton b2 = new JButton(" ");
          b2.setBounds(50,50,40,20);
          b2.setBackground(Color.cyan);
          JButton b3 = new JButton(" ");
          b3.setBounds(50,50,40,20);
          b3.setBackground(Color.CYAN);
          panel.add(b1);
          panel.add(b2);
          panel.add(b3);
          frame.add(panel);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main (String[]args){
        new Panel();
    }
}
