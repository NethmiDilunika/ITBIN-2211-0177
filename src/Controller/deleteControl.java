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
public class deleteControl {
    
  public void delet(int id){
        
        new Model.deleteOrder().delete(id);

} 
  
    public void delet_1(int id){
        
        new Model.deleteOrder().delete_1(id);

}
  
    
}
