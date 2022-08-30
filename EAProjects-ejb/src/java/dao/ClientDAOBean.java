/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.ClientDAOBeanLocal;
import entities.Client;
import javax.ejb.Stateless;

/**
 *
 * @author Utilisateur
 */
@Stateless
public class ClientDAOBean extends GenericDAOBean<Client, Integer> implements ClientDAOBeanLocal {

    public ClientDAOBean() {
        super(Client.class);
    }
    
}
