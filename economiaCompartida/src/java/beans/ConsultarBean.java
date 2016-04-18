/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import logic.ConsultarC;
import model.Publicacion;

<<<<<<< HEAD
import logic.ConsultarC;
import model.Publicacion;
=======
>>>>>>> origin/master
/**
 *
 * @author Alan
 */
@ManagedBean
@RequestScoped
public class ConsultarBean {
<<<<<<< HEAD
=======

    //private int elementoActual;

>>>>>>> origin/master
    private String clave;
    private ConsultarC termino;
    private ArrayList<Publicacion> resultados;

    private final HttpServletRequest httpServletRequest; // Obtiene información de todas las peticiones de usuario.
    private final FacesContext faceContext; // Obtiene información de la aplicación
    private FacesMessage message; // Permite el envio de mensajes entre el bean y la vista.
<<<<<<< HEAD
  
   
    public ConsultarBean(){
       
=======
    //private ConsultarC helper;

    public ConsultarBean() {
>>>>>>> origin/master
        faceContext = FacesContext.getCurrentInstance();
        httpServletRequest = (HttpServletRequest) faceContext.getExternalContext().getRequest();
    }
<<<<<<< HEAD
    
    
    public String buscar(){
       termino = new ConsultarC();
       this.resultados = new ArrayList<>();
       System.out.println("clave: " + clave);
       this.resultados = (ArrayList<Publicacion>) termino.buscar(clave);
       
       return "ConsultarIH";
=======

    public String buscar() {
        termino = new ConsultarC();
        this.resultados = new ArrayList<>();
        System.out.println("clave: " + clave);
        this.resultados = (ArrayList<Publicacion>) termino.buscar(clave);
        //System.out.println("Tamaño de la lista de re: " + this.resultados.size());
        return "ConsultarIH";
>>>>>>> origin/master
    }

    public ConsultarC getTermino() {
        return termino;
    }

    public void setTermino(ConsultarC t) {
        this.termino = t;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String c) {
        this.clave = c;
    }

    public ArrayList<Publicacion> getResultados() {
        return this.resultados;
    }

    public void setClave(ArrayList<Publicacion> r) {
        this.resultados = r;
    }
}
