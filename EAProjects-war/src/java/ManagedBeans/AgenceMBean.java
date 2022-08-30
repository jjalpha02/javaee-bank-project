/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagedBeans;

import entities.Agence;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.naming.Context;
import services.AgenceServiceBean;
import services.local.AgenceServiceBeanLocal;
import services.remote.AgenceServiceBeanRemote;

/**
 *
 * @author Utilisateur
 */
@ManagedBean
@ViewScoped
public class AgenceMBean implements Serializable{
    
    @EJB
    private AgenceServiceBeanLocal agenceService;
    //private AgenceServiceBeanLocal agenceServ;
    
    private Agence agence= new Agence();
    private List<Agence> agences = new ArrayList<Agence>();
    
    public static void main(String[] args) {
        try {
            Context context = MBeansUtility.getInitialContext();
            AgenceServiceBeanLocal agenceS = (AgenceServiceBeanLocal) context.lookup("");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public List<Agence> getAgences() {
        return agences;
    }

    public void setAgences(List<Agence> agences) {
        this.agences = agences;
    }
    
    public Agence saveAgence() {
        agenceService.addOne(agence);
        agence = new Agence();
        return agence;
    }
    
    public Agence updateAgence() {
        agenceService.updateOne(agence);
        return agence;
    }
    
    public List<Agence> getAllAgence() {
        agences = agenceService.getAll();
        return agences;
    }
    
    
    
    
}
