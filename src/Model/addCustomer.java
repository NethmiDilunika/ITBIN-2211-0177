/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author This PC
 */
public class addCustomer {
    Connection con = null;
    PreparedStatement pst = null;
    
    public void customer(int cid,String fullname,String nic,String email,String address,int tele){
   con = DBconnector.conn();
        
        try {
            String sqlquery = "INSERT INTO customer(CustomerId, FullName, NIC, Email, Address, ContactNo) VALUES (?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sqlquery);
           
            pst.setInt(1, cid);
            pst.setString(2, fullname); 
            pst.setString(3,nic );
            pst.setString(4,email);
            pst.setString(5,address );
            pst.setInt(6,tele );
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULY");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
