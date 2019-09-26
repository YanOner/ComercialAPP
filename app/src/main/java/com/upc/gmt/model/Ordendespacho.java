package com.upc.gmt.model;

import java.util.Date;

public class Ordendespacho {
    private Integer idOrdenDespacho;

    private Date fechaMovilidad;

    private String usuarioAtendio;

    private Date fechaAtencion;

    private Date fechaProgramada;

    private Date fechaEntrega;

    private Integer idVenta;

    private Integer iidCourrier;

    public Ordendespacho(Integer idOrdenDespacho, Date fechaMovilidad, String usuarioAtendio, Date fechaAtencion, Date fechaProgramada, Date fechaEntrega, Integer idVenta, Integer iidCourrier) {
        this.idOrdenDespacho = idOrdenDespacho;
        this.fechaMovilidad = fechaMovilidad;
        this.usuarioAtendio = usuarioAtendio;
        this.fechaAtencion = fechaAtencion;
        this.fechaProgramada = fechaProgramada;
        this.fechaEntrega = fechaEntrega;
        this.idVenta = idVenta;
        this.iidCourrier = iidCourrier;
    }

    public Ordendespacho() {
        super();
    }

    public Integer getIdOrdenDespacho() {
        return idOrdenDespacho;
    }

    public void setIdOrdenDespacho(Integer idOrdenDespacho) {
        this.idOrdenDespacho = idOrdenDespacho;
    }

    public Date getFechaMovilidad() {
        return fechaMovilidad;
    }

    public void setFechaMovilidad(Date fechaMovilidad) {
        this.fechaMovilidad = fechaMovilidad;
    }

    public String getUsuarioAtendio() {
        return usuarioAtendio;
    }

    public void setUsuarioAtendio(String usuarioAtendio) {
        this.usuarioAtendio = usuarioAtendio == null ? null : usuarioAtendio.trim();
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getIidCourrier() {
        return iidCourrier;
    }

    public void setIidCourrier(Integer iidCourrier) {
        this.iidCourrier = iidCourrier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idOrdenDespacho=").append(idOrdenDespacho);
        sb.append(", fechaMovilidad=").append(fechaMovilidad);
        sb.append(", usuarioAtendio=").append(usuarioAtendio);
        sb.append(", fechaAtencion=").append(fechaAtencion);
        sb.append(", fechaProgramada=").append(fechaProgramada);
        sb.append(", fechaEntrega=").append(fechaEntrega);
        sb.append(", idVenta=").append(idVenta);
        sb.append(", iidCourrier=").append(iidCourrier);
        sb.append("]");
        return sb.toString();
    }
}