/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ma.projet.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author LENOVO
 */
public class Test {
    public  static void main (String[] args) {
        Session s=HibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
    }
    
}
