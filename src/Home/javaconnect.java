package Home;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman_Lap
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn;
    
     
    public static Connection ConnecrDb(){
        try{
            
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:E:\\STUDIES\\AAAAAAJAVAAAAAAAAAAAAAAAAA\\Projects\\Blood Group Administration\\Database\\Admins.sqlite");
            return conn;
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,e);
            return null;
            
        }
        
    }
}
