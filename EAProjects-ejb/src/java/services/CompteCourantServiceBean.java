/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.CompteCourantDAOBean;
import dao.local.CompteCourantDAOBeanLocal;
import dao.local.GenericDAOBeanLocal;
import entities.CompteCourant;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import services.local.CompteCourantServiceBeanLocal;

/**
 *
 * @author Utilisateur
 */
@Stateless
public class CompteCourantServiceBean extends GenericServiceBean<CompteCourant, Integer> implements CompteCourantServiceBeanLocal {
    
    @EJB
    private CompteCourantDAOBeanLocal dao;
    
    private final Logger logger;
    
    public CompteCourantServiceBean() {
        this.logger = Logger.getLogger(CompteCourantServiceBean.class.getName());
    }

    @Override
    protected GenericDAOBeanLocal<CompteCourant, Integer> getDAO() {
        return this.dao;
    }
    
    
}
