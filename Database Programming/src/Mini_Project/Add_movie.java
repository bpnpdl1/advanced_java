
package Mini_Project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;


public class Add_movie implements ActionListener{
    
    JTextField j_id,j_name,j_genre;
    String[][] data;
    
    public Add_movie(){
    JFrame f=new JFrame("Add movie");
    
   
    GridBagLayout grid =new GridBagLayout();
    GridBagConstraints gbs=new GridBagConstraints();

   f.setLayout(grid);
    
   gbs.fill=GridBagConstraints.HORIZONTAL;
   gbs.gridx=0;
   gbs.gridy=0;
  
   f.add(new Label("Add Movie"),gbs);
   
   gbs.gridx=0;
   gbs.gridy=1;
   f.add(new Label("Id :"),gbs);
   
    j_id=new JTextField(15);
   gbs.gridx=1;
   gbs.gridy=1;
   f.add(j_id,gbs);
   
   gbs.gridx=0;
   gbs.gridy=2;
   f.add(new Label("Name :"),gbs);
   
    j_name=new JTextField(15);
   gbs.gridx=1;
   gbs.gridy=2;
   f.add(j_name,gbs);
   
   gbs.gridx=0;
   gbs.gridy=3;
   f.add(new Label("Genre :"),gbs);
   
    j_genre=new JTextField(15);
   gbs.gridx=1;
   gbs.gridy=3;
   f.add(j_genre,gbs);
   
   Button bt_insert=new Button("Insert");
   gbs.gridx=0;
   gbs.gridy=4;
   gbs.gridwidth=2;
   f.add(bt_insert,gbs);
   
  String[] cn={"Id","Name","Genre"};
  String[][] data={{"1","Ram","dsjdhs"},{"2","jdshds","323"}};
  
  
 JTable table=new JTable(data, cn);
  gbs.gridx=0;
  gbs.gridy=5;
  f.add(table,gbs);
   
   
   
   bt_insert.addActionListener(this);
   
   
   f.setSize(300,400);
   f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        int id;
        String name,genre;
        
        id=Integer.parseInt(j_id.getText());
        name=j_name.getText();
        genre=j_genre.getText();
        
        //db conn
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
        
        PreparedStatement pst=conn.prepareStatement("insert into movies values(?,?,?)");
        pst.setInt(1, id);
        pst.setString(2,name);
        pst.setString(3, genre);
        pst.executeUpdate();
        
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from movies");
        String[][] data={};
            int i=0;
            int data1;
            while (rs.next()) {
            
            data[i][1]=String.valueOf(rs.getInt(1));
            data[i][2]=rs.getString(2);
            data[i][3]=rs.getString(3);
            i++;
            
}
        
          
        pst.close();
        conn.close();
        
        }catch(ClassNotFoundException | SQLException ex){
            System.err.println(ex);
        }
        
    }
    
   
    
    public static void main(String[] args) throws Exception {
        new Add_movie();
    }
    
    
    
}
