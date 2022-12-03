/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Init;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author nicol
 */
@Named("sessionBean")
@SessionScoped
public class AdministradorSesion implements Serializable{
    
    private String value;
    private List<String> cositas;
    
    @PostConstruct
    public void init(){
        System.out.println("Hola");
        cositas = new ArrayList<>();
        for(int i = 0; i<10; i++){
            cositas.add("" + i);
        }
    }
    
     /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the cositas
     */
    public List<String> getCositas() {
        return cositas;
    }

    /**
     * @param cositas the cositas to set
     */
    public void setCositas(List<String> cositas) {
        this.cositas = cositas;
    }
    
}
