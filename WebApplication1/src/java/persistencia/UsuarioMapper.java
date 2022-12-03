/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import modelodominio.Usuario;

/**
 *
 * @author nicol
 */
public class UsuarioMapper extends AbstractMapper<Usuario, Integer>{
      
    @Override
    public Usuario buscar(Integer id) {
        return em.find(Usuario.class, id);
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return em.createQuery("Usuario.findAll").getResultList();
    }
     
}
