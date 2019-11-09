/*
 * Created on 2019-11-03 ( Date ISO 2019-11-03 - Time 08:43:13 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
 */


package com.upc.gmt.bean;

import java.io.Serializable;

/**
 * Java bean for entity "tipoproducto" <br>
 * Contains only "wrapper types" (no primitive types) <br>
 * Can be used both as a "web form" and "persistence record" <br>
 *
 * @author Telosys Tools Generator
 */
public class Tipoproducto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer idtipoproducto; // Integer // Id or Primary Key

    private String descripcion;  // String
    private String estado;  // String

    /**
     * Default constructor
     */
    public Tipoproducto() {
        super();
    }

    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR ID OR PRIMARY KEY 
    //----------------------------------------------------------------------

    /**
     * Set the "idtipoproducto" field value
     * This field is mapped on the database column "idTipoProducto" ( type "INT", NotNull : true )
     *
     * @param idtipoproducto
     */
    public void setIdtipoproducto(Integer idtipoproducto) {
        this.idtipoproducto = idtipoproducto;
    }

    /**
     * Get the "idtipoproducto" field value
     * This field is mapped on the database column "idTipoProducto" ( type "INT", NotNull : true )
     *
     * @return the field value
     */
    public Integer getIdtipoproducto() {
        return this.idtipoproducto;
    }

    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR OTHER DATA FIELDS 
    //----------------------------------------------------------------------

    /**
     * Set the "descripcion" field value
     * This field is mapped on the database column "Descripcion" ( type "VARCHAR", NotNull : false )
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Get the "descripcion" field value
     * This field is mapped on the database column "Descripcion" ( type "VARCHAR", NotNull : false )
     *
     * @return the field value
     */
    public String getDescripcion() {
        return this.descripcion;
    }

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
        sb.append(idtipoproducto);
        sb.append("|");
        sb.append(descripcion);
        sb.append("|");
        sb.append(estado);
        return sb.toString();
    }


}