/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.AgenceDAOBeanLocal;
import entities.Agence;
import javax.ejb.Stateless;

/**
 *
 * @author Utilisateur
 */
@Stateless
public class AgenceDAOBean extends GenericDAOBean<Agence, Integer> implements AgenceDAOBeanLocal {

    public AgenceDAOBean() {
        super(Agence.class);
    }
    
    
}
