/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.local;

import entities.CompteCourant;
import javax.ejb.Local;

/**
 *
 * @author Utilisateur
 */
@Local
public interface CompteCourantServiceBeanLocal extends GenericServiceBeanLocal<CompteCourant, Integer>{
    
}
