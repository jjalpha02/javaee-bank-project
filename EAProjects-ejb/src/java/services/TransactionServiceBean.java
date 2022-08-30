/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.TransactionDAOBean;
import dao.local.GenericDAOBeanLocal;
import dao.local.TransactionDAOBeanLocal;
import entities.Transaction;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import services.local.TransactionServiceBeanLocal;

/**
 *
 * @author Utilisateur
 */
@Stateless
public class TransactionServiceBean extends GenericServiceBean<Transaction, Integer> implements TransactionServiceBeanLocal {

    @EJB
    private TransactionDAOBeanLocal dao;
    
    private final Logger logger;

    public TransactionServiceBean() {
        this.logger = Logger.getLogger(TransactionServiceBean.class.getName());
    }   
    
    @Override
    protected GenericDAOBeanLocal<Transaction, Integer> getDAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
