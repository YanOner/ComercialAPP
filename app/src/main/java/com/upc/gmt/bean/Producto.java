package com.upc.gmt.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Producto implements Cloneable {

    private Integer idproducto; // Integer // Id or Primary Key

    private String sku;  // String
    private String descripcion;  // String
    private Integer idtipoproducto;  // Integer
    private String genero;  // String

    private BigDecimal preciounitario;  // BigDecimal

    private BigDecimal preciovendedor;  // BigDecimal
    private String estilo;  // String
    private String estado;  // String
    private BigDecimal descuentomaximo;  // BigDecimal

    private BigDecimal descuentoactual;  // BigDecimal

    private Date fechaultimacarga;  // Date

    private Date fechaproximacarga;  // Date
    private String usuariogenero;  // String

    private Date fechageneracion;  // Date
    private String usuariomodifico;  // String

    private Date fechamodificacion;  // Date

    private BigDecimal altopaquete;  // BigDecimal

    private BigDecimal anchopaquete;  // BigDecimal

    private BigDecimal largopaquete;  // BigDecimal
    private String observacion;  // String
    private Integer idtemporada;  // Integer
    private Integer idumd;  // Integer

    private BigDecimal peso;  // BigDecimal

    //ADICIONAL
    private String tipoProducto;
    private String temporada;
    private String idColor;
    private String color;
    private Integer nroTalla;
    private String componente;
    private String material;
    private Integer stockVenta;
    private boolean isChecked;
    private int cantidad;
    private int descuentoSeleccionado;

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getIdColor() {
        return idColor;
    }

    public void setIdColor(String idColor) {
        this.idColor = idColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNroTalla() {
        return nroTalla;
    }

    public void setNroTalla(Integer nroTalla) {
        this.nroTalla = nroTalla;
    }

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Default constructor
     */
    public Producto() {
        super();
    }

    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR ID OR PRIMARY KEY
    //----------------------------------------------------------------------

    /**
     * Set the "idproducto" field value
     * This field is mapped on the database column "IdProducto" ( type "INT", NotNull : true )
     *
     * @param idproducto
     */
    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    /**
     * Get the "idproducto" field value
     * This field is mapped on the database column "IdProducto" ( type "INT", NotNull : true )
     *
     * @return the field value
     */
    public Integer getIdproducto() {
        return this.idproducto;
    }

    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR OTHER DATA FIELDS
    //----------------------------------------------------------------------

    /**
     * Set the "sku" field value
     * This field is mapped on the database column "SKU" ( type "VARCHAR", NotNull : true )
     *
     * @param sku
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * Get the "sku" field value
     * This field is mapped on the database column "SKU" ( type "VARCHAR", NotNull : true )
     *
     * @return the field value
     */
    public String getSku() {
        return this.sku;
    }

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
     * Set the "idtipoproducto" field value
     * This field is mapped on the database column "IdTipoProducto" ( type "INT", NotNull : false )
     *
     * @param idtipoproducto
     */
    public void setIdtipoproducto(Integer idtipoproducto) {
        this.idtipoproducto = idtipoproducto;
    }

    /**
     * Get the "idtipoproducto" field value
     * This field is mapped on the database column "IdTipoProducto" ( type "INT", NotNull : false )
     *
     * @return the field value
     */
    public Integer getIdtipoproducto() {
        return this.idtipoproducto;
    }

    /**
     * Set the "genero" field value
     * This field is mapped on the database column "Genero" ( type "CHAR", NotNull : false )
     *
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Get the "genero" field value
     * This field is mapped on the database column "Genero" ( type "CHAR", NotNull : false )
     *
     * @return the field value
     */
    public String getGenero() {
        return this.genero;
    }

    /**
     * Set the "preciounitario" field value
     * This field is mapped on the database column "PrecioUnitario" ( type "DECIMAL", NotNull : false )
     *
     * @param preciounitario
     */
    public void setPreciounitario(BigDecimal preciounitario) {
        this.preciounitario = preciounitario;
    }

    /**
     * Get the "preciounitario" field value
     * This field is mapped on the database column "PrecioUnitario" ( type "DECIMAL", NotNull : false )
     *
     * @return the field value
     */
    public BigDecimal getPreciounitario() {
        return this.preciounitario;
    }

    /**
     * Set the "preciovendedor" field value
     * This field is mapped on the database column "PrecioVendedor" ( type "DECIMAL", NotNull : false )
     *
     * @param preciovendedor
     */
    public void setPreciovendedor(BigDecimal preciovendedor) {
        this.preciovendedor = preciovendedor;
    }

    /**
     * Get the "preciovendedor" field value
     * This field is mapped on the database column "PrecioVendedor" ( type "DECIMAL", NotNull : false )
     *
     * @return the field value
     */
    public BigDecimal getPreciovendedor() {
        return this.preciovendedor;
    }

    /**
     * Set the "estilo" field value
     * This field is mapped on the database column "Estilo" ( type "VARCHAR", NotNull : false )
     *
     * @param estilo
     */
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    /**
     * Get the "estilo" field value
     * This field is mapped on the database column "Estilo" ( type "VARCHAR", NotNull : false )
     *
     * @return the field value
     */
    public String getEstilo() {
        return this.estilo;
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
     * Set the "descuentomaximo" field value
     * This field is mapped on the database column "DescuentoMaximo" ( type "DECIMAL", NotNull : true )
     *
     * @param descuentomaximo
     */
    public void setDescuentomaximo(BigDecimal descuentomaximo) {
        this.descuentomaximo = descuentomaximo;
    }

    /**
     * Get the "descuentomaximo" field value
     * This field is mapped on the database column "DescuentoMaximo" ( type "DECIMAL", NotNull : true )
     *
     * @return the field value
     */
    public BigDecimal getDescuentomaximo() {
        return this.descuentomaximo;
    }

    /**
     * Set the "descuentoactual" field value
     * This field is mapped on the database column "DescuentoActual" ( type "DECIMAL", NotNull : false )
     *
     * @param descuentoactual
     */
    public void setDescuentoactual(BigDecimal descuentoactual) {
        this.descuentoactual = descuentoactual;
    }

    /**
     * Get the "descuentoactual" field value
     * This field is mapped on the database column "DescuentoActual" ( type "DECIMAL", NotNull : false )
     *
     * @return the field value
     */
    public BigDecimal getDescuentoactual() {
        return this.descuentoactual;
    }

    /**
     * Set the "fechaultimacarga" field value
     * This field is mapped on the database column "FechaUltimaCarga" ( type "DATE", NotNull : false )
     *
     * @param fechaultimacarga
     */
    public void setFechaultimacarga(Date fechaultimacarga) {
        this.fechaultimacarga = fechaultimacarga;
    }

    /**
     * Get the "fechaultimacarga" field value
     * This field is mapped on the database column "FechaUltimaCarga" ( type "DATE", NotNull : false )
     *
     * @return the field value
     */
    public Date getFechaultimacarga() {
        return this.fechaultimacarga;
    }

    /**
     * Set the "fechaproximacarga" field value
     * This field is mapped on the database column "FechaProximaCarga" ( type "DATE", NotNull : false )
     *
     * @param fechaproximacarga
     */
    public void setFechaproximacarga(Date fechaproximacarga) {
        this.fechaproximacarga = fechaproximacarga;
    }

    /**
     * Get the "fechaproximacarga" field value
     * This field is mapped on the database column "FechaProximaCarga" ( type "DATE", NotNull : false )
     *
     * @return the field value
     */
    public Date getFechaproximacarga() {
        return this.fechaproximacarga;
    }

    /**
     * Set the "usuariogenero" field value
     * This field is mapped on the database column "UsuarioGenero" ( type "CHAR", NotNull : false )
     *
     * @param usuariogenero
     */
    public void setUsuariogenero(String usuariogenero) {
        this.usuariogenero = usuariogenero;
    }

    /**
     * Get the "usuariogenero" field value
     * This field is mapped on the database column "UsuarioGenero" ( type "CHAR", NotNull : false )
     *
     * @return the field value
     */
    public String getUsuariogenero() {
        return this.usuariogenero;
    }

    /**
     * Set the "fechageneracion" field value
     * This field is mapped on the database column "FechaGeneracion" ( type "DATE", NotNull : false )
     *
     * @param fechageneracion
     */
    public void setFechageneracion(Date fechageneracion) {
        this.fechageneracion = fechageneracion;
    }

    /**
     * Get the "fechageneracion" field value
     * This field is mapped on the database column "FechaGeneracion" ( type "DATE", NotNull : false )
     *
     * @return the field value
     */
    public Date getFechageneracion() {
        return this.fechageneracion;
    }

    /**
     * Set the "usuariomodifico" field value
     * This field is mapped on the database column "UsuarioModifico" ( type "CHAR", NotNull : false )
     *
     * @param usuariomodifico
     */
    public void setUsuariomodifico(String usuariomodifico) {
        this.usuariomodifico = usuariomodifico;
    }

    /**
     * Get the "usuariomodifico" field value
     * This field is mapped on the database column "UsuarioModifico" ( type "CHAR", NotNull : false )
     *
     * @return the field value
     */
    public String getUsuariomodifico() {
        return this.usuariomodifico;
    }

    /**
     * Set the "fechamodificacion" field value
     * This field is mapped on the database column "FechaModificacion" ( type "DATE", NotNull : false )
     *
     * @param fechamodificacion
     */
    public void setFechamodificacion(Date fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }

    /**
     * Get the "fechamodificacion" field value
     * This field is mapped on the database column "FechaModificacion" ( type "DATE", NotNull : false )
     *
     * @return the field value
     */
    public Date getFechamodificacion() {
        return this.fechamodificacion;
    }

    /**
     * Set the "altopaquete" field value
     * This field is mapped on the database column "AltoPaquete" ( type "DECIMAL", NotNull : false )
     *
     * @param altopaquete
     */
    public void setAltopaquete(BigDecimal altopaquete) {
        this.altopaquete = altopaquete;
    }

    /**
     * Get the "altopaquete" field value
     * This field is mapped on the database column "AltoPaquete" ( type "DECIMAL", NotNull : false )
     *
     * @return the field value
     */
    public BigDecimal getAltopaquete() {
        return this.altopaquete;
    }

    /**
     * Set the "anchopaquete" field value
     * This field is mapped on the database column "AnchoPaquete" ( type "DECIMAL", NotNull : false )
     *
     * @param anchopaquete
     */
    public void setAnchopaquete(BigDecimal anchopaquete) {
        this.anchopaquete = anchopaquete;
    }

    /**
     * Get the "anchopaquete" field value
     * This field is mapped on the database column "AnchoPaquete" ( type "DECIMAL", NotNull : false )
     *
     * @return the field value
     */
    public BigDecimal getAnchopaquete() {
        return this.anchopaquete;
    }

    /**
     * Set the "largopaquete" field value
     * This field is mapped on the database column "LargoPaquete" ( type "DECIMAL", NotNull : false )
     *
     * @param largopaquete
     */
    public void setLargopaquete(BigDecimal largopaquete) {
        this.largopaquete = largopaquete;
    }

    /**
     * Get the "largopaquete" field value
     * This field is mapped on the database column "LargoPaquete" ( type "DECIMAL", NotNull : false )
     *
     * @return the field value
     */
    public BigDecimal getLargopaquete() {
        return this.largopaquete;
    }

    /**
     * Set the "observacion" field value
     * This field is mapped on the database column "Observacion" ( type "VARCHAR", NotNull : false )
     *
     * @param observacion
     */
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    /**
     * Get the "observacion" field value
     * This field is mapped on the database column "Observacion" ( type "VARCHAR", NotNull : false )
     *
     * @return the field value
     */
    public String getObservacion() {
        return this.observacion;
    }

    /**
     * Set the "idtemporada" field value
     * This field is mapped on the database column "IdTemporada" ( type "INT", NotNull : true )
     *
     * @param idtemporada
     */
    public void setIdtemporada(Integer idtemporada) {
        this.idtemporada = idtemporada;
    }

    /**
     * Get the "idtemporada" field value
     * This field is mapped on the database column "IdTemporada" ( type "INT", NotNull : true )
     *
     * @return the field value
     */
    public Integer getIdtemporada() {
        return this.idtemporada;
    }

    /**
     * Set the "idumd" field value
     * This field is mapped on the database column "IdUMD" ( type "INT", NotNull : true )
     *
     * @param idumd
     */
    public void setIdumd(Integer idumd) {
        this.idumd = idumd;
    }

    /**
     * Get the "idumd" field value
     * This field is mapped on the database column "IdUMD" ( type "INT", NotNull : true )
     *
     * @return the field value
     */
    public Integer getIdumd() {
        return this.idumd;
    }

    /**
     * Set the "peso" field value
     * This field is mapped on the database column "Peso" ( type "DECIMAL", NotNull : false )
     *
     * @param peso
     */
    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    /**
     * Get the "peso" field value
     * This field is mapped on the database column "Peso" ( type "DECIMAL", NotNull : false )
     *
     * @return the field value
     */
    public BigDecimal getPeso() {
        return this.peso;
    }

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(idproducto);
        sb.append("|");
        sb.append(sku);
        sb.append("|");
        sb.append(descripcion);
        sb.append("|");
        sb.append(idtipoproducto);
        sb.append("|");
        sb.append(genero);
        sb.append("|");
        sb.append(preciounitario);
        sb.append("|");
        sb.append(preciovendedor);
        sb.append("|");
        sb.append(estilo);
        sb.append("|");
        sb.append(estado);
        sb.append("|");
        sb.append(descuentomaximo);
        sb.append("|");
        sb.append(descuentoactual);
        sb.append("|");
        sb.append(fechaultimacarga);
        sb.append("|");
        sb.append(fechaproximacarga);
        sb.append("|");
        sb.append(usuariogenero);
        sb.append("|");
        sb.append(fechageneracion);
        sb.append("|");
        sb.append(usuariomodifico);
        sb.append("|");
        sb.append(fechamodificacion);
        sb.append("|");
        sb.append(altopaquete);
        sb.append("|");
        sb.append(anchopaquete);
        sb.append("|");
        sb.append(largopaquete);
        sb.append("|");
        sb.append(observacion);
        sb.append("|");
        sb.append(idtemporada);
        sb.append("|");
        sb.append(idumd);
        sb.append("|");
        sb.append(peso);
        return sb.toString();
    }

    public Integer getStockVenta() {
        return stockVenta;
    }

    public void setStockVenta(Integer stockVenta) {
        this.stockVenta = stockVenta;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDescuentoSeleccionado() {
        return descuentoSeleccionado;
    }

    public void setDescuentoSeleccionado(int descuentoSeleccionado) {
        this.descuentoSeleccionado = descuentoSeleccionado;
    }
}