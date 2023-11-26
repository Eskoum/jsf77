/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import entities.Service;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import service.ServiceService;

/**
 *
 * @author Lachgar
 */
@ManagedBean
@SessionScoped
public class ServiceBean {
    
    private Service service;
    private List<Service> services;

    /**
     * Creates a new instance of ServiceBean
     */
    public ServiceBean() {
        services = new ArrayList<>();
        service = new Service();
        ServiceService serviceService = new ServiceService();
    }

    public void onCreateAction (){
        System.out.println(service.getId());
        System.out.println(service.getCode());
        System.out.println(service.getLibelle());
        services.add(service);
        System.out.println(services);
        service = new Service();
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
public void onDeleteAction(Service serviceToDelete) {
        
        if (services.contains(serviceToDelete)) {
            services.remove(serviceToDelete);
            System.out.println("Item deleted. Updated services: " + services);
        } else {
            System.out.println("Service not found in the list.");
        }
    }

   

    }
    

   

