/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.AgenceDAOBean;
import dao.local.AgenceDAOBeanLocal;
import dao.local.GenericDAOBeanLocal;
import entities.Agence;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import services.local.AgenceServiceBeanLocal;

/**
 *
 * @author Utilisateur
 */
@Stateless
public class AgenceServiceBean extends GenericServiceBean<Agence, Integer> implements AgenceServiceBeanLocal {

    @EJB
    private AgenceDAOBeanLocal dao;
    
    private final Logger logger;

    public AgenceServiceBean() {
        this.logger = Logger.getLogger(AgenceServiceBean.class.getName());
    }
    
    @Override
    protected GenericDAOBeanLocal<Agence, Integer> getDAO() {
        return this.dao;
    }
    
}
