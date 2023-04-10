import javax.swing.*;
import java.awt.*;
public class Gridlayout {
    Gridlayout(){
        JFrame f = new JFrame("Grid Layout");
        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        JButton b5 = new JButton("B5");
        JButton b6 = new JButton("B6");
        JButton b7 = new JButton("B7");
        JButton b8 = new JButton("B8");
        JButton b9 = new JButton("B9");

        GridLayout gl=new GridLayout(3,3);


        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
       f.setLayout(gl);
       f.setVisible(true);
       f.setSize(300,300);

    }
    public static void main(String[] args) {
Gridlayout m=new Gridlayout();
    }
}