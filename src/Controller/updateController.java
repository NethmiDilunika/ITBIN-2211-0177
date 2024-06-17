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
public class updateController {
    
     public void update(int id, String pymentM, String oList) {
        new Model.updateData().update(id, pymentM, oList);
    }
     
     public void update_1(int id, String pymentM, String oList) {
        new Model.updateData().update_1(id, pymentM, oList);
    }
}   

