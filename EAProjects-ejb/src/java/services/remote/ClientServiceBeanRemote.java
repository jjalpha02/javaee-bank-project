/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.remote;

import entities.Client;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author Utilisateur
 */
@Remote
public interface ClientServiceBeanRemote extends GenericServiceBeanRemote<Client, Integer>{
    
}
