package Layouts;

import java.awt.*;
import javax.swing.*;

public class Flowlayout {
    Flowlayout(){
        JFrame f= new JFrame("Flowlayout"); 
        JLabel l1= new JLabel("Username");
        JLabel l2= new JLabel("Password");
        JTextField t1= new JTextField("Bipin",15);
        JPasswordField p1= new JPasswordField("1234",15);
        JButton b1= new JButton("Login");
        
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(p1);
        f.add(b1);
        
        FlowLayout f1=new FlowLayout(FlowLayout.LEFT,10,20);
        f.setLayout(f1);
        
        f.setSize(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }

    
    public static void main(String[] args) {
        new Flowlayout();
        
    }
    
}