package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.Date;

public class Disponibilidadmovilidad {
    private Integer idMovilidad;

    private Integer idOrdenDespacho;

    private Date fechaMovilidad;

    private BigDecimal altoDisponible;

    private BigDecimal anchoDisponible;

    private BigDecimal largoDisponible;

    public Disponibilidadmovilidad(Integer idMovilidad, Integer idOrdenDespacho, Date fechaMovilidad, BigDecimal altoDisponible, BigDecimal anchoDisponible, BigDecimal largoDisponible) {
        this.idMovilidad = idMovilidad;
        this.idOrdenDespacho = idOrdenDespacho;
        this.fechaMovilidad = fechaMovilidad;
        this.altoDisponible = altoDisponible;
        this.anchoDisponible = anchoDisponible;
        this.largoDisponible = largoDisponible;
    }

    public Disponibilidadmovilidad() {
        super();
    }

    public Integer getIdMovilidad() {
        return idMovilidad;
    }

    public void setIdMovilidad(Integer idMovilidad) {
        this.idMovilidad = idMovilidad;
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

    public BigDecimal getAltoDisponible() {
        return altoDisponible;
    }

    public void setAltoDisponible(BigDecimal altoDisponible) {
        this.altoDisponible = altoDisponible;
    }

    public BigDecimal getAnchoDisponible() {
        return anchoDisponible;
    }

    public void setAnchoDisponible(BigDecimal anchoDisponible) {
        this.anchoDisponible = anchoDisponible;
    }

    public BigDecimal getLargoDisponible() {
        return largoDisponible;
    }

    public void setLargoDisponible(BigDecimal largoDisponible) {
        this.largoDisponible = largoDisponible;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idMovilidad=").append(idMovilidad);
        sb.append(", idOrdenDespacho=").append(idOrdenDespacho);
        sb.append(", fechaMovilidad=").append(fechaMovilidad);
        sb.append(", altoDisponible=").append(altoDisponible);
        sb.append(", anchoDisponible=").append(anchoDisponible);
        sb.append(", largoDisponible=").append(largoDisponible);
        sb.append("]");
        return sb.toString();
    }
}