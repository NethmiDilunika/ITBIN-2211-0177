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
public class ProductController {
    
    public void product(int pid,String pname,String ctgr,String brand,String price,String description){
        
        new Model.addProduct().addProduct(pid,pname,ctgr,brand,price,description);
       
    }
    
}
