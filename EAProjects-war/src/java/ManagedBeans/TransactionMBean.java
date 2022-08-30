/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagedBeans;

import entities.Transaction;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import services.local.TransactionServiceBeanLocal;

/**
 *
 * @author Utilisateur
 */
@ManagedBean
@ViewScoped
public class TransactionMBean {
    
    @EJB
    private TransactionServiceBeanLocal transactionServ;
    private Transaction transaction;

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
    
    public void enregistrerTransaction() {
        transactionServ.addOne(transaction);
        transaction = new Transaction();
    }
    
}
