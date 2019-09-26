package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.Date;

public class Pagosordenconsignacion {
    private Integer idOrdenConsignacion;

    private Date fechaProgramada;

    private Integer correlativo;

    private BigDecimal montoAbonado;

    private Date fechaPago;

    private String nroBoletaPago;

    public Pagosordenconsignacion(Integer idOrdenConsignacion, Date fechaProgramada, Integer correlativo, BigDecimal montoAbonado, Date fechaPago, String nroBoletaPago) {
        this.idOrdenConsignacion = idOrdenConsignacion;
        this.fechaProgramada = fechaProgramada;
        this.correlativo = correlativo;
        this.montoAbonado = montoAbonado;
        this.fechaPago = fechaPago;
        this.nroBoletaPago = nroBoletaPago;
    }

    public Pagosordenconsignacion() {
        super();
    }

    public Integer getIdOrdenConsignacion() {
        return idOrdenConsignacion;
    }

    public void setIdOrdenConsignacion(Integer idOrdenConsignacion) {
        this.idOrdenConsignacion = idOrdenConsignacion;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public Integer getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(Integer correlativo) {
        this.correlativo = correlativo;
    }

    public BigDecimal getMontoAbonado() {
        return montoAbonado;
    }

    public void setMontoAbonado(BigDecimal montoAbonado) {
        this.montoAbonado = montoAbonado;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getNroBoletaPago() {
        return nroBoletaPago;
    }

    public void setNroBoletaPago(String nroBoletaPago) {
        this.nroBoletaPago = nroBoletaPago == null ? null : nroBoletaPago.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idOrdenConsignacion=").append(idOrdenConsignacion);
        sb.append(", fechaProgramada=").append(fechaProgramada);
        sb.append(", correlativo=").append(correlativo);
        sb.append(", montoAbonado=").append(montoAbonado);
        sb.append(", fechaPago=").append(fechaPago);
        sb.append(", nroBoletaPago=").append(nroBoletaPago);
        sb.append("]");
        return sb.toString();
    }
}