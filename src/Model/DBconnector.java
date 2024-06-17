/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package Model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBconnector {
    
    public static Connection conn(){
        
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/earringdb","admin","Nethmi@123");
           // String url = "jdbc:mysql://localhost:3306/earringdb";
           // String user = "admin";
           // String passworld = "Nethmi@123";
          //  Class.forName("com.mysql.jdbc.Driver");
          //  Connection conn = (Connection) DriverManager.getConnection(url, user, passworld);
          //  return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
}
*/
/*
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBconnector {
    
    public static Connection conn() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Note the updated driver class
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/earringdb", "admin", "Nethmi@123");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
}
*/
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBconnector {
    
    public static Connection conn() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Note the updated driver class
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/earringdb", "admin", "Nethmi@123");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()); // Use e.getMessage() for a better error message
        }
        return conn;
    }
}


