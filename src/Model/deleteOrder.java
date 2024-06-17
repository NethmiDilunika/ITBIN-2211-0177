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
public class deleteOrder {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void delete(int id){
        
        con = DBconnector.conn();
        
        try{
           // String sqlquery = "DELETE FROM `order` WHERE customerId = '"+id+"' ";
            String sqlqury="DELETE FROM `order` WHERE `orderId` = '"+id+"'";
            pst = con.prepareStatement(sqlqury);
            pst.execute();
            JOptionPane.showMessageDialog(null, "DELETED");
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
}
}
  
        public void delete_1(int id){
        
        con = DBconnector.conn();
        
        try{
           // String sqlquery = "DELETE FROM `order` WHERE customerId = '"+id+"' ";
            String sqlqury="DELETE FROM `product` WHERE `ProductId` = '"+id+"'";
            pst = con.prepareStatement(sqlqury);
            pst.execute();
            JOptionPane.showMessageDialog(null, "DELETED");
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
}
}
}
