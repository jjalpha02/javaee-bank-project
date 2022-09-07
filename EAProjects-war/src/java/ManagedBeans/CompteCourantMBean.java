/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagedBeans;

import entities.CompteCourant;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import services.local.CompteCourantServiceBeanLocal;

/**
 *
 * @author Utilisateur
 */
@ManagedBean
@ViewScoped
public class CompteCourantMBean {
    
    @EJB
    private CompteCourantServiceBeanLocal cpteCourantService;
    
    private CompteCourant cpteCourant;
    private List<CompteCourant> cpteCourants = new ArrayList<CompteCourant>();

    public CompteCourant getCpteCourant() {
        return cpteCourant;
    }

    public void setCpteCourant(CompteCourant cpteCourant) {
        this.cpteCourant = cpteCourant;
    }

    public List<CompteCourant> getCpteCourants() {
        return cpteCourants;
    }

    public void setCpteCourants(List<CompteCourant> cpteCourants) {
        this.cpteCourants = cpteCourants;
    }
    
    public void enregistrerCompteCourant() {
        cpteCourantService.addOne(cpteCourant);
        cpteCourant = new CompteCourant();
    }
    
    public CompteCourant updateCompteCourant() {
        cpteCourantService.updateOne(cpteCourant);
        return cpteCourant;
    }
    
    public List<CompteCourant> getAllCompteCourant() {
        cpteCourants = cpteCourantService.getAll();
        return cpteCourants;
    }
    
    public CompteCourant getOneCompteCourant(Integer id) {
        cpteCourant = cpteCourantService.getOne(id);
        return cpteCourant;
    }
        
    public void deleteCompteCourant() {
        cpteCourantService.deleteOne(cpteCourant);
    }
    
}
