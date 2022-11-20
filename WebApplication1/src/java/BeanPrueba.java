
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicol
 */

@Named("helloWorld")
@SessionScoped
public class BeanPrueba implements Serializable{
       
    private List<String> datos ;
    
    public BeanPrueba(){
        System.out.println("Bean Iniciado");
        datos = new ArrayList<>();
        for(int i = 0 ; i<10; i++){
            datos.add("dato" + i);
        }
    }
    
    public String mensaje(){    
        return "Hola Mundo";
    }
    
    public void accion(){
        System.out.println("Hola Mundito");
    }

    /**
     * @return the datos
     */
    public List<String> getDatos() {
        return datos;
    }

    /**
     * @param datos the datos to set
     */
    public void setDatos(List<String> datos) {
        this.datos = datos;
    }
    
}
