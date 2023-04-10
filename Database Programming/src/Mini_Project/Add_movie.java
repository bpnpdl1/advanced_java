/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mini_Project;

import java.awt.FlowLayout;
//import java.sql.*;
import javax.swing.*;
public class Add_movie extends JFrame{
      Add_movie(){
          setTitle("Add Movie");
          
//          JLabel lbAddmovie=new JLabel("Add movie");
//          add(lbAddmovie);
          
          JLabel lbId=new JLabel("Id :",10);
          add(lbId);
          
          JTextField jtfId=new JTextField(15);
          add(jtfId);
          
            JLabel lbName=new JLabel("Name :",10);
          add(lbName);
          
          JTextField jtName=new JTextField(15);
          add(jtName);
          FlowLayout f1=new FlowLayout(FlowLayout.LEADING,20,20);
          setLayout(f1);
          setSize(250,500);
          setVisible(true);
        
        
    }
    public static void main(String[] args) {
        Add_movie addmovie=new Add_movie();
        
    }
}
