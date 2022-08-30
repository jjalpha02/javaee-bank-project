/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagedBeans;

import entities.CompteEpargne;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import services.local.CompteEpargneServiceBeanLocal;

/**
 *
 * @author Utilisateur
 */
@ManagedBean
@ViewScoped
public class CompteEpargneMBean {
    
    @EJB
    private CompteEpargneServiceBeanLocal compteEpargneServ;
    private CompteEpargne cpteEpargne;

    public CompteEpargne getCpteEpargne() {
        return cpteEpargne;
    }

    public void setCpteEpargne(CompteEpargne cpteEpargne) {
        this.cpteEpargne = cpteEpargne;
    }
    
    public void enregistrerCompteEpargne() {
        compteEpargneServ.addOne(cpteEpargne);
        cpteEpargne = new CompteEpargne();
    }
    
}
