package com.upc.gmt.bean;

public class Bancos {

    private String idbancos; // String // Id or Primary Key
    private Integer correlativo; // Integer // Id or Primary Key
    private String descripcion;  // String
    private String tipocuenta;  // String
    private String nrocuenta;  // String
    private String estado;  // String

    public Bancos() {
        super();
    }

    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR ID OR PRIMARY KEY
    //----------------------------------------------------------------------

    /**
     * Set the "idbancos" field value
     * This field is mapped on the database column "IdBancos" ( type "CHAR", NotNull : true )
     *
     * @param idbancos
     */
    public void setIdbancos(String idbancos) {
        this.idbancos = idbancos;
    }

    /**
     * Get the "idbancos" field value
     * This field is mapped on the database column "IdBancos" ( type "CHAR", NotNull : true )
     *
     * @return the field value
     */
    public String getIdbancos() {
        return this.idbancos;
    }

    /**
     * Set the "correlativo" field value
     * This field is mapped on the database column "Correlativo" ( type "INT", NotNull : true )
     *
     * @param correlativo
     */
    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

    /**
     * Get the "correlativo" field value
     * This field is mapped on the database column "Correlativo" ( type "INT", NotNull : true )
     *
     * @return the field value
     */
    public Integer getCorrelativo() {
        return this.correlativo;
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
     * Set the "tipocuenta" field value
     * This field is mapped on the database column "TipoCuenta" ( type "VARCHAR", NotNull : true )
     *
     * @param tipocuenta
     */
    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    /**
     * Get the "tipocuenta" field value
     * This field is mapped on the database column "TipoCuenta" ( type "VARCHAR", NotNull : true )
     *
     * @return the field value
     */
    public String getTipocuenta() {
        return this.tipocuenta;
    }

    /**
     * Set the "nrocuenta" field value
     * This field is mapped on the database column "NroCuenta" ( type "VARCHAR", NotNull : false )
     *
     * @param nrocuenta
     */
    public void setNrocuenta(String nrocuenta) {
        this.nrocuenta = nrocuenta;
    }

    /**
     * Get the "nrocuenta" field value
     * This field is mapped on the database column "NroCuenta" ( type "VARCHAR", NotNull : false )
     *
     * @return the field value
     */
    public String getNrocuenta() {
        return this.nrocuenta;
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
        sb.append(idbancos);
        sb.append("|");
        sb.append(correlativo);
        sb.append("|");
        sb.append(descripcion);
        sb.append("|");
        sb.append(tipocuenta);
        sb.append("|");
        sb.append(nrocuenta);
        sb.append("|");
        sb.append(estado);
        return sb.toString();
    }
}