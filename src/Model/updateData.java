
package Model;
/*
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class updateData {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void update(int id, String pymentM, String oList){
        
        con = DBconnector.conn();
        
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed.");
            return;
        }
        
        try {
            String sqlquery = "UPDATE `order` SET paymentMethods = ?, orderItem = ? WHERE orderId = ?";
            pst = con.prepareStatement(sqlquery);
            pst.setString(1, pymentM);
            pst.setString(2, oList);
            pst.setInt(3, id);
            
            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Update successful");
            } else {
              //  JOptionPane.showMessageDialog(null, e);
            }
        } catch (SQLException e) { // Print the stack trace for debugging
            // Print the stack trace for debugging
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                // Print the stack trace for debugging
                
            }
        }
    }
}
*/

import Model.DBconnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class updateData {
    Connection con = null;
    PreparedStatement pst = null;

    public void update(int id, String pymentM, String oList) {
        con = DBconnector.conn();

        if (con == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed.");
            return;
        }

        try {
            String sqlquery = "UPDATE `order` SET paymentMethods = ?, orderItem = ? WHERE orderId = ?";
            pst = con.prepareStatement(sqlquery);
            pst.setString(1, pymentM);
            pst.setString(2, oList);
            pst.setInt(3, id);

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Update successful");
            } else {
                JOptionPane.showMessageDialog(null, "No rows were updated. Please check the input data and try again.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL error: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Failed to close resources: " + e.getMessage());
            }
        }
    }
    
    
    public void update_1(int id, String pymentM, String oList) {
        con = DBconnector.conn();

        if (con == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed.");
            return;
        }

        try {
            String sqlquery = "UPDATE `product` SET Price = ?, Description = ? WHERE ProductId = ?";
            pst = con.prepareStatement(sqlquery);
            pst.setString(1, pymentM);
            pst.setString(2, oList);
            pst.setInt(3, id);

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Update successful");
            } else {
                JOptionPane.showMessageDialog(null, "No rows were updated. Please check the input data and try again.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL error: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Failed to close resources: " + e.getMessage());
            }
        }
    }
    
    
    
}
