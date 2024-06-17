/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author This PC
 */
public class tableLoad {
    
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public ResultSet fetchTableData() {
        con = DBconnector.conn();
        try {
            String sql = "SELECT orderId , customerId, orderDate, delevaryDate, paymentMethods, orderItem FROM `order`";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    
    
    public ResultSet fetchTableData_1() {
        con = DBconnector.conn();
        try {
            String sql = "SELECT ProductId , ProductName, Category, Brand, Price, Description FROM `product`";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    
    
    public ResultSet searchData(int id){
      con = DBconnector.conn();
        try {
            String sql = "SELECT * FROM `order` WHERE orderId LIKE '%"+id+"%'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs;
    }
    
     public ResultSet searchData_1(int id){
      con = DBconnector.conn();
        try {
            String sql = "SELECT * FROM `product` WHERE ProductId LIKE '%"+id+"%'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs;
    }
    
    
}
