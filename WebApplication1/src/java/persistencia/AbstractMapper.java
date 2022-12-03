/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nicol
 * @param <T>
 * @param <K>
 */
public abstract class AbstractMapper <T, K>{
    
    @PersistenceContext
    public static EntityManager em;
    
    public abstract T buscar(K id);
    
    public abstract List<T> obtenerTodos();
    
    public T crear(T object){
        em.persist(object);
        em.flush();
        em.refresh(object);
        return object;
    }
    
    public T actualizar(T object){
        return (T) em.merge(object);
    }
    
    public void eliminar(T object){
        object = em.merge(object);
        em.remove(object);
    }
    
}
