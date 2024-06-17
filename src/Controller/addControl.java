/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JTextField;


public class addControl {
    
   public void item(int ordId, int cstmId,  String ordDate, String delvrDate, String paymnMehd, String ordritem){
       new Model.addModel().addDetails(ordId, cstmId, ordDate, delvrDate, paymnMehd, ordritem);
   }

    public void item(int id, int cuId, String ordDate, String delvrDate, String paymnMehd, JTextField ol) {        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
