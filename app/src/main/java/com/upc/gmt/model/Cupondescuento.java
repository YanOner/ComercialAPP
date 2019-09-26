package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.Date;

public class Cupondescuento {
    private Integer idCuponDescuento;

    private String codigoCupon;

    private Date fechaValInicio;

    private Date fechaValFin;

    private BigDecimal porcDescuento;

    private BigDecimal montoDescuento;

    private String observacion;

    public Cupondescuento(Integer idCuponDescuento, String codigoCupon, Date fechaValInicio, Date fechaValFin, BigDecimal porcDescuento, BigDecimal montoDescuento, String observacion) {
        this.idCuponDescuento = idCuponDescuento;
        this.codigoCupon = codigoCupon;
        this.fechaValInicio = fechaValInicio;
        this.fechaValFin = fechaValFin;
        this.porcDescuento = porcDescuento;
        this.montoDescuento = montoDescuento;
        this.observacion = observacion;
    }

    public Cupondescuento() {
        super();
    }

    public Integer getIdCuponDescuento() {
        return idCuponDescuento;
    }

    public void setIdCuponDescuento(Integer idCuponDescuento) {
        this.idCuponDescuento = idCuponDescuento;
    }

    public String getCodigoCupon() {
        return codigoCupon;
    }

    public void setCodigoCupon(String codigoCupon) {
        this.codigoCupon = codigoCupon == null ? null : codigoCupon.trim();
    }

    public Date getFechaValInicio() {
        return fechaValInicio;
    }

    public void setFechaValInicio(Date fechaValInicio) {
        this.fechaValInicio = fechaValInicio;
    }

    public Date getFechaValFin() {
        return fechaValFin;
    }

    public void setFechaValFin(Date fechaValFin) {
        this.fechaValFin = fechaValFin;
    }

    public BigDecimal getPorcDescuento() {
        return porcDescuento;
    }

    public void setPorcDescuento(BigDecimal porcDescuento) {
        this.porcDescuento = porcDescuento;
    }

    public BigDecimal getMontoDescuento() {
        return montoDescuento;
    }

    public void setMontoDescuento(BigDecimal montoDescuento) {
        this.montoDescuento = montoDescuento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion == null ? null : observacion.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idCuponDescuento=").append(idCuponDescuento);
        sb.append(", codigoCupon=").append(codigoCupon);
        sb.append(", fechaValInicio=").append(fechaValInicio);
        sb.append(", fechaValFin=").append(fechaValFin);
        sb.append(", porcDescuento=").append(porcDescuento);
        sb.append(", montoDescuento=").append(montoDescuento);
        sb.append(", observacion=").append(observacion);
        sb.append("]");
        return sb.toString();
    }
}