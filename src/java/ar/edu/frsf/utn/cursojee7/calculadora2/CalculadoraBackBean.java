/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.frsf.utn.cursojee7.calculadora2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Administrador
 */
@Named(value = "calc")
@SessionScoped
public class CalculadoraBackBean implements Serializable{
    
    private List<Operacion> historialOperaciones;
    private Operacion operacion;
    
    @PostConstruct
    public void iniciar(){
        this.historialOperaciones = new ArrayList<Operacion>();
    }
    
    public String sumar(){
        // aqui insertaremos la lógica para los calculos.
        this.operacion.setResultado(operacion.getOperador1()+operacion.getOperador2());
        this.operacion.setFecha(new Date());
        this.operacion.setTipoOperacion("SUMA");
        this.historialOperaciones.add(operacion);
        return null;
    }

    public String nueva(){
        this.operacion = new  Operacion();
        return null;
    }
    
    public String borrar(){
        int indiceElemento = this.buscarIndiceOperacion();
        this.historialOperaciones.remove(indiceElemento);
        return null;
    }
    

    private int buscarIndiceOperacion(){
        int indice =0;
        for(Operacion unaOp : this.historialOperaciones){
            if(unaOp.getFecha()==this.operacion.getFecha() && this.operacion.getResultado() == unaOp.getResultado()){
                return indice;
            }
            indice++;
        }
        return indice;
    }
    
    /**
     * @return the historialOperaciones
     */
    public List<Operacion> getHistorialOperaciones() {
        return historialOperaciones;
    }

    /**
     * @param historialOperaciones the historialOperaciones to set
     */
    public void setHistorialOperaciones(List<Operacion> historialOperaciones) {
        this.historialOperaciones = historialOperaciones;
    }

    /**
     * @return the operacion
     */
    public Operacion getOperacion() {
        return operacion;
    }

    /**
     * @param operacion the operacion to set
     */
    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }
    
    
    
}
