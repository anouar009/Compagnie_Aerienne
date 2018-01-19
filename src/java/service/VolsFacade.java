/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Vols;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Anouar
 */
@Stateless
public class VolsFacade extends AbstractFacade<Vols> {

    @PersistenceContext(unitName = "Compagnie_AeriennePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VolsFacade() {
        super(Vols.class);
    }
    
}
