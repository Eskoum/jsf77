/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import Service.EmployeService;
import entities.Employe;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartModel;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author Lachgar
 */
@ManagedBean
@SessionScoped
public class EmployeBean {
    
    private Employe employe;
    private List<Employe> employes;

    /**
     * Creates a new instance of EmployeBean
     */
    public EmployeBean() {
        employes = new ArrayList<>();
        employe = new Employe();
    }

    public void onCreateAction (){
        System.out.println(employe.getNom());
        System.out.println(employe.getPrenom());
          System.out.println(employe.getDaten());
            System.out.println(employe.getPhoto());
        employes.add(employe);
        System.out.println(employes);
        employe = new Employe();
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
   

    

   
}
