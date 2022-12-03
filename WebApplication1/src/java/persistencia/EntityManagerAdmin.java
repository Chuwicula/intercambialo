/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author nicol
 */
public class EntityManagerAdmin {
    
    private static EntityManager entityManager;
    
    private static EntityManagerFactory entityManagerFactory;
    
    public static EntityManager getEntityManager(){
        if(entityManager == null){
            entityManagerFactory = Persistence.createEntityManagerFactory("intercambialoPU");
            entityManager = entityManagerFactory.createEntityManager();
        }        
        return entityManager;
    }
    
}
