/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.local.GenericDAOBeanLocal;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJBContext;
import services.local.GenericServiceBeanLocal;

/**
 *
 * @author Utilisateur
 */
public abstract class GenericServiceBean<E extends Serializable, ID> implements GenericServiceBeanLocal<E, ID> {
    
    
    @Resource
    protected EJBContext context;

    protected abstract GenericDAOBeanLocal<E, ID> getDAO();

    protected final Logger logger;

    public GenericServiceBean() {
        this.logger = Logger.getLogger(getClass().getName());
    }

    @Override
    public void addOne(E e) {
        this.getDAO().addOne(e);
    }

    @Override
    public E addOneWithFlush(E e) {
        return this.getDAO().addOneWithFlush(e);
    }

   
    @Override
    public E updateOne(E e) {
        return this.getDAO().updateOne(e);
    }


    @Override
    public void deleteOne(E e) {
        this.getDAO().deleteOne(e);
    }

   

    @Override
    public void deleteOne(ID id) {
        E e = this.getDAO().getOne(id);
        this.getDAO().deleteOne(e);
    }


    @Override
    public void deleteAll() {
        this.getDAO().deleteAll();
    }

    @Override
    public E getOne(ID id) {
        return this.getDAO().getOne(id);
    }

    @Override
    public List<E> getAll() {
        return this.getDAO().getAll();
    }

    @Override
    public Long count() {
        return this.getDAO().count();
    }


    @Override
    public boolean exists(ID id) {
        return this.getDAO().getOne(id) != null;
    }

    public EJBContext getContext() {
        return context;
    }

    public void setContext(EJBContext context) {
        this.context = context;
    }
    
    
}
