/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author This PC
 */
public class CustomerController {
    
    public void cstmr(int cid,String fullname,String nic,String email,String address,int tele){
        
        new Model.addCustomer().customer(cid,fullname,nic,email,address,tele);
        
    }
    
    
}
