/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import sesion.AdministradorSesion;

@Named("inicioBean")
@RequestScoped
public class inicioBean implements Serializable{
    
    @Inject
    AdministradorSesion sessionBean;
    
    public String iniciarSesion(){
        sessionBean.setValue("jeje");
        return "/modulos/trocador/disponibles.xhtml?faces-redirect=true";
    }
    
}
