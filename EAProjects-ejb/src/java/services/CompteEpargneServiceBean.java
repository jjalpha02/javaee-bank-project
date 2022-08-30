/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.CompteEpargneDAOBean;
import dao.local.CompteEpargneDAOBeanLocal;
import dao.local.GenericDAOBeanLocal;
import entities.CompteEpargne;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import services.local.CompteEpargneServiceBeanLocal;

/**
 *
 * @author Utilisateur
 */
@Stateless
public class CompteEpargneServiceBean extends GenericServiceBean<CompteEpargne, Integer> implements CompteEpargneServiceBeanLocal {
    
    
    @EJB
    private CompteEpargneDAOBeanLocal dao;
    
    private final Logger logger;
    
    public CompteEpargneServiceBean() {
        this.logger = Logger.getLogger(CompteCourantServiceBean.class.getName());
    }

    @Override
    protected GenericDAOBeanLocal<CompteEpargne, Integer> getDAO() {
        return this.dao;
    }
}
