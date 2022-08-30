/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.ClientDAOBean;
import dao.local.ClientDAOBeanLocal;
import dao.local.GenericDAOBeanLocal;
import entities.Client;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import services.local.ClientServiceBeanLocal;

/**
 *
 * @author Utilisateur
 */
@Stateless
public class ClientServiceBean extends GenericServiceBean<Client, Integer> implements ClientServiceBeanLocal {

    @EJB
    private ClientDAOBeanLocal dao;

    private final Logger logger;
    
    public ClientServiceBean() {
        this.logger = Logger.getLogger(ClientServiceBean.class.getName());
    }
    
    @Override
    protected GenericDAOBeanLocal<Client, Integer> getDAO() {
        return this.dao;
    }
    
}
