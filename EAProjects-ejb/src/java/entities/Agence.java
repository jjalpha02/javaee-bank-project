/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Utilisateur
 */
@Entity
public class Agence implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAg;
    private String nomAg;
    private String telAg;
    
    
    public Agence() {}  

    public Agence(Integer idAg, String nomAg, String telAg) {
        this.idAg = idAg;
        this.nomAg = nomAg;
        this.telAg = telAg;
    }
      
    public Integer getIdAg() {
        return idAg;
    }

    public void setIdAg(Integer idAg) {
        this.idAg = idAg;
    }

    public String getNomAg() {
        return nomAg;
    }

    public void setNomAg(String nomAg) {
        this.nomAg = nomAg;
    }

    public String getTelAg() {
        return telAg;
    }

    public void setTelAg(String telAg) {
        this.telAg = telAg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAg != null ? idAg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agence)) {
            return false;
        }
        Agence other = (Agence) object;
        if ((this.idAg == null && other.idAg != null) || (this.idAg != null && !this.idAg.equals(other.idAg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Agence[ id=" + idAg + " ]";
    }
    
}
