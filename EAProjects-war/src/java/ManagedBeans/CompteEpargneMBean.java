/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagedBeans;

import entities.CompteEpargne;
import java.util.ArrayList;
import java.util.List;
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
    private CompteEpargneServiceBeanLocal cpteEpargneService;
    
    private CompteEpargne cpteEpargne;
    private List<CompteEpargne> cpteEpargnes = new ArrayList<CompteEpargne>();

    public CompteEpargne getCpteEpargne() {
        return cpteEpargne;
    }

    public void setCpteEpargne(CompteEpargne cpteEpargne) {
        this.cpteEpargne = cpteEpargne;
    }
    
    public void enregistrerCompteEpargne() {
        cpteEpargneService.addOne(cpteEpargne);
        cpteEpargne = new CompteEpargne();
    }
    
    public CompteEpargne updateCompteEpargne() {
        cpteEpargneService.updateOne(cpteEpargne);
        return cpteEpargne;
    }
    
    public List<CompteEpargne> getAllCompteEpargne() {
        cpteEpargnes = cpteEpargneService.getAll();
        return cpteEpargnes;
    }
    
    public CompteEpargne getOneCompteEpargne(Integer id) {
        cpteEpargne = cpteEpargneService.getOne(id);
        return cpteEpargne;
    }
        
    public void deleteCompteEpargne() {
        cpteEpargneService.deleteOne(cpteEpargne);
    }
}
