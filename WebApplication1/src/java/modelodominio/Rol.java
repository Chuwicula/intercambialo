/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelodominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author nicol
 */
@Entity
public class Rol implements Serializable {
    
    @Id
    public String nombreRol;
    public int idRol;
}
