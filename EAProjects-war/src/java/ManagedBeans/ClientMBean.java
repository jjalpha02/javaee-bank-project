/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagedBeans;

import entities.Client;
import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import services.local.ClientServiceBeanLocal;
import services.remote.ClientServiceBeanRemote;

/**
 *
 * @author Utilisateur
 */
@ManagedBean
@ViewScoped
public class ClientMBean implements Serializable {
    
    @EJB
    private ClientServiceBeanRemote clientServ;
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public void enregistrerClient() {
        clientServ.addOne(client);
        client = new Client();
    }
    
    
}
