/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagedBeans;

import entities.Client;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.naming.Context;
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
    private ClientServiceBeanLocal clientService;
    
    private Client client;
    private List<Client> clients = new ArrayList<Client>();
    
    public static void main(String[] args) {
        try {
            Context context = MBeansUtility.getInitialContext();
            ClientServiceBeanLocal clientService = (ClientServiceBeanLocal) context.lookup("");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    
    public void enregistrerClient() {
        clientService.addOne(client);
        client = new Client();
    }
    
    public Client updateClient() {
        clientService.updateOne(client);
        return client;
    }
    
    public List<Client> getAllClient() {
        clients = clientService.getAll();
        return clients;
    }
    
    public Client getOneClient(Integer id) {
        client = clientService.getOne(id);
        return client;
    }
        
    public void deleteClient() {
        clientService.deleteOne(client);
    }
    
    
}
