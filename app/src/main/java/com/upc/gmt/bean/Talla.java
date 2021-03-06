/*
 * Created on 2019-11-03 ( Date ISO 2019-11-03 - Time 08:43:12 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
 */


package com.upc.gmt.bean;

import java.io.Serializable;


/**
 * Java bean for entity "talla" <br>
 * Contains only "wrapper types" (no primitive types) <br>
 * Can be used both as a "web form" and "persistence record" <br>
 *
 * @author Telosys Tools Generator
 */
public class Talla implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer nrotalla; // Integer // Id or Primary Key

    private String estado;  // String

    /**
     * Default constructor
     */
    public Talla() {
        super();
    }

    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR ID OR PRIMARY KEY 
    //----------------------------------------------------------------------

    /**
     * Set the "nrotalla" field value
     * This field is mapped on the database column "NroTalla" ( type "INT", NotNull : true )
     *
     * @param nrotalla
     */
    public void setNrotalla(Integer nrotalla) {
        this.nrotalla = nrotalla;
    }

    /**
     * Get the "nrotalla" field value
     * This field is mapped on the database column "NroTalla" ( type "INT", NotNull : true )
     *
     * @return the field value
     */
    public Integer getNrotalla() {
        return this.nrotalla;
    }

    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR OTHER DATA FIELDS 
    //----------------------------------------------------------------------

    /**
     * Set the "estado" field value
     * This field is mapped on the database column "Estado" ( type "CHAR", NotNull : false )
     *
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Get the "estado" field value
     * This field is mapped on the database column "Estado" ( type "CHAR", NotNull : false )
     *
     * @return the field value
     */
    public String getEstado() {
        return this.estado;
    }

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(nrotalla);
        sb.append("|");
        sb.append(estado);
        return sb.toString();
    }


}
