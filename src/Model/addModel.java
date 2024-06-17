
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class addModel {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addDetails(int ordId, int cstmId, String ordDate, String delvrDate, String paymnMehd, String ol ) {
        con = DBconnector.conn();
        
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed");
            return;
        }

        try {
            String sql = "INSERT INTO `order` (orderId, customerId, orderDate, delevaryDate, paymentMethods, orderItem) VALUES (?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, ordId);
            pst.setInt(2, cstmId);
            pst.setString(3, ordDate);
            pst.setString(4, delvrDate);
            pst.setString(5, paymnMehd);
            pst.setString(6,ol );
            pst.execute();
            JOptionPane.showMessageDialog(null, "DATA INSERT SUCCESSFUL");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()); // Use e.getMessage() for a more specific error message
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
