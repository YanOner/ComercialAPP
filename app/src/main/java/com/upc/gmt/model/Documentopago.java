package com.upc.gmt.model;

import java.util.Date;

public class Documentopago {
    private String nroSerie;

    private String codDocumento;

    private String nroRuc;

    private String tipoDocumento;

    private Date fechaPago;

    private String usuarioGenero;

    private Date fehaGeneracion;

    private String usuarioModifico;

    private Date fechaModificacion;

    private Integer venta_idVenta;

    public Documentopago(String nroSerie, String codDocumento, String nroRuc, String tipoDocumento, Date fechaPago, String usuarioGenero, Date fehaGeneracion, String usuarioModifico, Date fechaModificacion, Integer venta_idVenta) {
        this.nroSerie = nroSerie;
        this.codDocumento = codDocumento;
        this.nroRuc = nroRuc;
        this.tipoDocumento = tipoDocumento;
        this.fechaPago = fechaPago;
        this.usuarioGenero = usuarioGenero;
        this.fehaGeneracion = fehaGeneracion;
        this.usuarioModifico = usuarioModifico;
        this.fechaModificacion = fechaModificacion;
        this.venta_idVenta = venta_idVenta;
    }

    public Documentopago() {
        super();
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie == null ? null : nroSerie.trim();
    }

    public String getCodDocumento() {
        return codDocumento;
    }

    public void setCodDocumento(String codDocumento) {
        this.codDocumento = codDocumento == null ? null : codDocumento.trim();
    }

    public String getNroRuc() {
        return nroRuc;
    }

    public void setNroRuc(String nroRuc) {
        this.nroRuc = nroRuc == null ? null : nroRuc.trim();
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento == null ? null : tipoDocumento.trim();
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getUsuarioGenero() {
        return usuarioGenero;
    }

    public void setUsuarioGenero(String usuarioGenero) {
        this.usuarioGenero = usuarioGenero == null ? null : usuarioGenero.trim();
    }

    public Date getFehaGeneracion() {
        return fehaGeneracion;
    }

    public void setFehaGeneracion(Date fehaGeneracion) {
        this.fehaGeneracion = fehaGeneracion;
    }

    public String getUsuarioModifico() {
        return usuarioModifico;
    }

    public void setUsuarioModifico(String usuarioModifico) {
        this.usuarioModifico = usuarioModifico == null ? null : usuarioModifico.trim();
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Integer getVenta_idVenta() {
        return venta_idVenta;
    }

    public void setVenta_idVenta(Integer venta_idVenta) {
        this.venta_idVenta = venta_idVenta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nroSerie=").append(nroSerie);
        sb.append(", codDocumento=").append(codDocumento);
        sb.append(", nroRuc=").append(nroRuc);
        sb.append(", tipoDocumento=").append(tipoDocumento);
        sb.append(", fechaPago=").append(fechaPago);
        sb.append(", usuarioGenero=").append(usuarioGenero);
        sb.append(", fehaGeneracion=").append(fehaGeneracion);
        sb.append(", usuarioModifico=").append(usuarioModifico);
        sb.append(", fechaModificacion=").append(fechaModificacion);
        sb.append(", venta_idVenta=").append(venta_idVenta);
        sb.append("]");
        return sb.toString();
    }
}