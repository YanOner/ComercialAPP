package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.Date;

public class Ordenconsignacion {
    private Integer idOrdenConsignacion;

    private Date fechaProgramada;

    private Integer idVenta;

    private Integer nroCuota;

    private BigDecimal montoCuota;

    private BigDecimal mora;

    private String estado;

    public Ordenconsignacion(Integer idOrdenConsignacion, Date fechaProgramada, Integer idVenta, Integer nroCuota, BigDecimal montoCuota, BigDecimal mora, String estado) {
        this.idOrdenConsignacion = idOrdenConsignacion;
        this.fechaProgramada = fechaProgramada;
        this.idVenta = idVenta;
        this.nroCuota = nroCuota;
        this.montoCuota = montoCuota;
        this.mora = mora;
        this.estado = estado;
    }

    public Ordenconsignacion() {
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

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(Integer nroCuota) {
        this.nroCuota = nroCuota;
    }

    public BigDecimal getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(BigDecimal montoCuota) {
        this.montoCuota = montoCuota;
    }

    public BigDecimal getMora() {
        return mora;
    }

    public void setMora(BigDecimal mora) {
        this.mora = mora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado == null ? null : estado.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idOrdenConsignacion=").append(idOrdenConsignacion);
        sb.append(", fechaProgramada=").append(fechaProgramada);
        sb.append(", idVenta=").append(idVenta);
        sb.append(", nroCuota=").append(nroCuota);
        sb.append(", montoCuota=").append(montoCuota);
        sb.append(", mora=").append(mora);
        sb.append(", estado=").append(estado);
        sb.append("]");
        return sb.toString();
    }
}