package com.upc.gmt.bean;

import java.util.Date;

public class Cliente {

    private String nrodocumentocli; // String // Id or Primary Key

    private String nombres;  // String

    private Date fechanacimiento;  // Date
    private String estado;  // String
    private String celular;  // String

    private Date fechacreacion;  // Date

    private Double lineacreditoactual;  // Double

    private Double saldolineacredito;  // Double
    private String tipopersona;  // String

    public Cliente() {
        super();
    }

    /**
     * Set the "nrodocumentocli" field value
     * This field is mapped on the database column "NroDocumentoCli" ( type "VARCHAR", NotNull : true )
     *
     * @param nrodocumentocli
     */
    public void setNrodocumentocli(String nrodocumentocli) {
        this.nrodocumentocli = nrodocumentocli;
    }

    /**
     * Get the "nrodocumentocli" field value
     * This field is mapped on the database column "NroDocumentoCli" ( type "VARCHAR", NotNull : true )
     *
     * @return the field value
     */
    public String getNrodocumentocli() {
        return this.nrodocumentocli;
    }

    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR OTHER DATA FIELDS
    //----------------------------------------------------------------------

    /**
     * Set the "nombres" field value
     * This field is mapped on the database column "Nombres" ( type "VARCHAR", NotNull : false )
     *
     * @param nombres
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * Get the "nombres" field value
     * This field is mapped on the database column "Nombres" ( type "VARCHAR", NotNull : false )
     *
     * @return the field value
     */
    public String getNombres() {
        return this.nombres;
    }

    /**
     * Set the "fechanacimiento" field value
     * This field is mapped on the database column "FechaNacimiento" ( type "DATE", NotNull : false )
     *
     * @param fechanacimiento
     */
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    /**
     * Get the "fechanacimiento" field value
     * This field is mapped on the database column "FechaNacimiento" ( type "DATE", NotNull : false )
     *
     * @return the field value
     */
    public Date getFechanacimiento() {
        return this.fechanacimiento;
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

    /**
     * Set the "celular" field value
     * This field is mapped on the database column "Celular" ( type "VARCHAR", NotNull : false )
     *
     * @param celular
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Get the "celular" field value
     * This field is mapped on the database column "Celular" ( type "VARCHAR", NotNull : false )
     *
     * @return the field value
     */
    public String getCelular() {
        return this.celular;
    }

    /**
     * Set the "fechacreacion" field value
     * This field is mapped on the database column "FechaCreacion" ( type "DATE", NotNull : false )
     *
     * @param fechacreacion
     */
    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    /**
     * Get the "fechacreacion" field value
     * This field is mapped on the database column "FechaCreacion" ( type "DATE", NotNull : false )
     *
     * @return the field value
     */
    public Date getFechacreacion() {
        return this.fechacreacion;
    }

    /**
     * Set the "lineacreditoactual" field value
     * This field is mapped on the database column "LineaCreditoActual" ( type "DOUBLE", NotNull : false )
     *
     * @param lineacreditoactual
     */
    public void setLineacreditoactual(Double lineacreditoactual) {
        this.lineacreditoactual = lineacreditoactual;
    }

    /**
     * Get the "lineacreditoactual" field value
     * This field is mapped on the database column "LineaCreditoActual" ( type "DOUBLE", NotNull : false )
     *
     * @return the field value
     */
    public Double getLineacreditoactual() {
        return this.lineacreditoactual;
    }

    /**
     * Set the "saldolineacredito" field value
     * This field is mapped on the database column "SaldoLineaCredito" ( type "DOUBLE", NotNull : false )
     *
     * @param saldolineacredito
     */
    public void setSaldolineacredito(Double saldolineacredito) {
        this.saldolineacredito = saldolineacredito;
    }

    /**
     * Get the "saldolineacredito" field value
     * This field is mapped on the database column "SaldoLineaCredito" ( type "DOUBLE", NotNull : false )
     *
     * @return the field value
     */
    public Double getSaldolineacredito() {
        return this.saldolineacredito;
    }

    /**
     * Set the "tipopersona" field value
     * This field is mapped on the database column "TipoPersona" ( type "CHAR", NotNull : true )
     *
     * @param tipopersona
     */
    public void setTipopersona(String tipopersona) {
        this.tipopersona = tipopersona;
    }

    /**
     * Get the "tipopersona" field value
     * This field is mapped on the database column "TipoPersona" ( type "CHAR", NotNull : true )
     *
     * @return the field value
     */
    public String getTipopersona() {
        return this.tipopersona;
    }

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(nrodocumentocli);
        sb.append("|");
        sb.append(nombres);
        sb.append("|");
        sb.append(fechanacimiento);
        sb.append("|");
        sb.append(estado);
        sb.append("|");
        sb.append(celular);
        sb.append("|");
        sb.append(fechacreacion);
        sb.append("|");
        sb.append(lineacreditoactual);
        sb.append("|");
        sb.append(saldolineacredito);
        sb.append("|");
        sb.append(tipopersona);
        return sb.toString();
    }

}