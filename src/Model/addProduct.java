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
public class addProduct {
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addProduct(int pid,String pname,String ctgr,String brand,String price,String description){
   con = DBconnector.conn();
        
        try {
            String sqlquery = "INSERT INTO product(ProductId , ProductName, Category,Brand , Price , Description ) VALUES (?, ?, ?, ?, ?,?)";
            pst = con.prepareStatement(sqlquery);
           // pst.setInt(1, id);
            pst.setInt(1, pid);
            pst.setString(2, pname);
            pst.setString(3, ctgr);
            pst.setString(4, brand);
            pst.setString(5, price);
            pst.setString(6,description);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULY");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
