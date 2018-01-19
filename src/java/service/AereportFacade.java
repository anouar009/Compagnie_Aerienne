/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Aereport;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Anouar
 */
@Stateless
public class AereportFacade extends AbstractFacade<Aereport> {

    @PersistenceContext(unitName = "Compagnie_AeriennePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AereportFacade() {
        super(Aereport.class);
    }
    
}
