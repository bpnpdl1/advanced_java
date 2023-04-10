package Layouts;

import java.awt.*;
import javax.swing.*;

public class Borderlayout {
Borderlayout(){
    JFrame f=new JFrame("Border Layout");
    JButton b1=new JButton("B1");
    JButton b2=new JButton("B2");
    JButton b3=new JButton("B3");
    JButton b4=new JButton("B4");
    JButton b5=new JButton("B5");
    
    f.add(b1,BorderLayout.NORTH);
     f.add(b2,BorderLayout.SOUTH);
      f.add(b3,BorderLayout.WEST);
       f.add(b4,BorderLayout.EAST);
        f.add(b5,BorderLayout.CENTER);
        
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
}
    
    public static void main(String[] args) {
        Borderlayout b=new Borderlayout();
        
    }
    
}