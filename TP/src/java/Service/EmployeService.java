/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entities.Employe;

/**
 *
 * @author LENOVO
 */
public class EmployeService extends AbstractFacade<Employe> {

    protected Class<Employe> getEntityClass() {
        return Employe.class;
    }

   
    
    
}
