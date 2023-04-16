
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class Add_movie extends JFrame implements ActionListener{
    
    JTextField tf_movie_name,tf_movie_type;
      Add_movie(){
          JFrame f= new JFrame("Add Movie"); 
        JLabel l1= new JLabel("Movie Name",10);
        JLabel l2= new JLabel("Movie Type",10);
         tf_movie_name= new JTextField("",15);
         tf_movie_type= new JTextField("",15);
        JButton b1= new JButton("Insert");
        
        f.add(l1);
        f.add(tf_movie_name);
        f.add(l2);
        f.add(tf_movie_type);
        f.add(b1);
        
        b1.addActionListener(this);
        FlowLayout f1=new FlowLayout(FlowLayout.LEFT,10,20);
        f.setLayout(f1);
        
        f.setSize(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
      
      public static void dbconn_insert(String name,String type) throws Exception{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanced_java","root","");
          PreparedStatement pst=conn.prepareStatement("insert into movies movie_name,movie_type  values(?,?)");
          
          pst.setString(1,name);
          pst.setString(2,type);
          
         
      }
      
    @Override
        public void actionPerformed(ActionEvent e) {
         String movie_name=tf_movie_name.getText();
         String movie_type=tf_movie_type.getText();
         
        try {
            dbconn_insert(movie_name, movie_type);
        } catch (Exception ex) {
            Logger.getLogger(Add_movie.class.getName()).log(Level.SEVERE, null, ex);
        }
            
         

        }
      
      
    public static void main(String[] args) throws Exception {
      
        Add_movie addmovie=new Add_movie();
        
    }


  
}
