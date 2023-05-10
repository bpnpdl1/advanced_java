
import java.awt.*;
import javax.swing.*;

public class GridBaglayout extends JFrame {
    GridBaglayout(){
    setTitle("GridBagLayouts");
    GridBagLayout grid=new GridBagLayout();
    GridBagConstraints gbs=new  GridBagConstraints();
    setLayout(grid);
    gbs.fill=GridBagConstraints.HORIZONTAL;
    
    gbs.gridx=0;
    gbs.gridy=0;
    add(new JButton("Button 1"),gbs);
    
    gbs.gridx=0;
    gbs.gridy=1;
    add(new JButton("Button 2"),gbs);
    
    gbs.gridx=1;
    gbs.gridy=0;
    gbs.ipadx=30;
    gbs.ipady=40;
    add(new JButton("Button 3"),gbs);
    
    gbs.gridx=1;
    gbs.gridy=1;
    add(new JButton("Button 4"),gbs);
    
    gbs.gridx=3;
    gbs.gridy=0;
    gbs.ipady=192;
    gbs.gridheight=4;
    add(new JButton("Button 5"),gbs);
    
    gbs.gridx=0;
    gbs.gridy=3;
    gbs.ipady=60;
    gbs.ipadx=30;
    gbs.gridwidth=1;
    add(new JButton("Button 6"),gbs);  
    
    gbs.gridx=1;
    gbs.gridy=3;
    add(new JButton("Button 7"),gbs);
    
    gbs.gridx=0;
    gbs.gridy=4;
    gbs.ipady=60;
    gbs.ipadx=30;
    gbs.gridwidth=4;
    add(new JButton("Button 8"),gbs);  
    
    
    setSize(300,300);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    public static void main(String[] args) {
        new GridBaglayout();
       
    }
    
}