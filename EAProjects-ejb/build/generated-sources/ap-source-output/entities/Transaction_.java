package entities;

import entities.Compte;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-08-30T11:52:41")
@StaticMetamodel(Transaction.class)
public class Transaction_ { 

    public static volatile SingularAttribute<Transaction, String> dateTrans;
    public static volatile SingularAttribute<Transaction, String> typeTrans;
    public static volatile SingularAttribute<Transaction, Integer> idTrans;
    public static volatile SingularAttribute<Transaction, Float> montant;
    public static volatile SingularAttribute<Transaction, Compte> compte;

}