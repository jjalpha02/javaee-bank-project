/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services.local;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Utilisateur
 * @param <E>
 * @param <ID>
 */
public interface GenericServiceBeanLocal<E extends Serializable, ID> {
    
    void addOne(E e);

    E addOneWithFlush(E e);

    E updateOne(E e);

    void deleteOne(E e);

    void deleteOne(ID id);

    void deleteAll();

    E getOne(ID id);

    List<E> getAll();

    Long count();

    boolean exists(ID id);
    
}
