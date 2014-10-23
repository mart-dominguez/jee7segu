/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.edu.frsf.utn.cursojee7.calculadora2;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Operacion {
    private Integer operador1;
    private Integer operador2;
    private Integer resultado;
    private Date fecha;
    private String tipoOperacion;

    /**
     * @return the operador1
     */
    public Integer getOperador1() {
        return operador1;
    }

    /**
     * @param operador1 the operador1 to set
     */
    public void setOperador1(Integer operador1) {
        this.operador1 = operador1;
    }

    /**
     * @return the operador2
     */
    public Integer getOperador2() {
        return operador2;
    }

    /**
     * @param operador2 the operador2 to set
     */
    public void setOperador2(Integer operador2) {
        this.operador2 = operador2;
    }

    /**
     * @return the resultado
     */
    public Integer getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tipoOperacion
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * @param tipoOperacion the tipoOperacion to set
     */
    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }
    
    
}
