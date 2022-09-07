/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagedBeans;

import entities.Transaction;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
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
    private TransactionServiceBeanLocal transactionService;
    
    private Transaction transaction;
    private List<Transaction> transactions = new ArrayList<Transaction>();

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
    
    public void enregistrerTransaction() {
        transactionService.addOne(transaction);
        transaction = new Transaction();
    }
    
    public Transaction updateTransaction() {
        transactionService.updateOne(transaction);
        return transaction;
    }
    
    public List<Transaction> getAllTransaction() {
        transactions = transactionService.getAll();
        return transactions;
    }
    
    public Transaction getOneTransaction(Integer id) {
        transaction = transactionService.getOne(id);
        return transaction;
    }
        
    public void deleteTransaction() {
        transactionService.deleteOne(transaction);
    }
    
}
