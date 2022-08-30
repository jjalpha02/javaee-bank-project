/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.CompteEpargneDAOBeanLocal;
import entities.CompteEpargne;
import javax.ejb.Stateless;

/**
 *
 * @author Utilisateur
 */
@Stateless
public class CompteEpargneDAOBean extends GenericDAOBean<CompteEpargne, Integer> implements CompteEpargneDAOBeanLocal {

    public CompteEpargneDAOBean() {
        super(CompteEpargne.class);
    }
    
    
}
