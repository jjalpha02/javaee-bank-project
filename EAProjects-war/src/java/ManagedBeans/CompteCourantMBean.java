/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagedBeans;

import entities.CompteCourant;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
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
    private CompteCourantServiceBeanLocal compteCourantServ;
    private CompteCourant cpteCourant;

    public CompteCourant getCpteCourant() {
        return cpteCourant;
    }

    public void setCpteCourant(CompteCourant cpteCourant) {
        this.cpteCourant = cpteCourant;
    }

    
    public void enregistrerCompteCourant() {
        compteCourantServ.addOne(cpteCourant);
        cpteCourant = new CompteCourant();
    }
    
    
}
