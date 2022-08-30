package entities;

import entities.Agence;
import entities.Client;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-30T11:52:41")
@StaticMetamodel(Compte.class)
public abstract class Compte_ { 

    public static volatile SingularAttribute<Compte, Agence> agence;
    public static volatile SingularAttribute<Compte, String> dateCreation;
    public static volatile SingularAttribute<Compte, String> numero;
    public static volatile SingularAttribute<Compte, Integer> idCompte;
    public static volatile SingularAttribute<Compte, Double> solde;
    public static volatile SingularAttribute<Compte, Client> client;

}