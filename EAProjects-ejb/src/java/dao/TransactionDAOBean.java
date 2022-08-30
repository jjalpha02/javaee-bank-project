/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.TransactionDAOBeanLocal;
import entities.Transaction;
import javax.ejb.Stateless;

/**
 *
 * @author Utilisateur
 */
@Stateless
public class TransactionDAOBean extends GenericDAOBean<Transaction, Integer> implements TransactionDAOBeanLocal {

    public TransactionDAOBean() {
        super(Transaction.class);
    }
    
    
}
