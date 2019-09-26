package com.upc.gmt.model;

import java.math.BigDecimal;

public class Movilidad {
    private Integer idMovilidad;

    private String placa;

    private String marca;

    private String modelo;

    private BigDecimal capacidadAlto;

    private BigDecimal capacidadLargo;

    private BigDecimal capacidadAncho;

    public Movilidad(Integer idMovilidad, String placa, String marca, String modelo, BigDecimal capacidadAlto, BigDecimal capacidadLargo, BigDecimal capacidadAncho) {
        this.idMovilidad = idMovilidad;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadAlto = capacidadAlto;
        this.capacidadLargo = capacidadLargo;
        this.capacidadAncho = capacidadAncho;
    }

    public Movilidad() {
        super();
    }

    public Integer getIdMovilidad() {
        return idMovilidad;
    }

    public void setIdMovilidad(Integer idMovilidad) {
        this.idMovilidad = idMovilidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa == null ? null : placa.trim();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca == null ? null : marca.trim();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo == null ? null : modelo.trim();
    }

    public BigDecimal getCapacidadAlto() {
        return capacidadAlto;
    }

    public void setCapacidadAlto(BigDecimal capacidadAlto) {
        this.capacidadAlto = capacidadAlto;
    }

    public BigDecimal getCapacidadLargo() {
        return capacidadLargo;
    }

    public void setCapacidadLargo(BigDecimal capacidadLargo) {
        this.capacidadLargo = capacidadLargo;
    }

    public BigDecimal getCapacidadAncho() {
        return capacidadAncho;
    }

    public void setCapacidadAncho(BigDecimal capacidadAncho) {
        this.capacidadAncho = capacidadAncho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idMovilidad=").append(idMovilidad);
        sb.append(", placa=").append(placa);
        sb.append(", marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", capacidadAlto=").append(capacidadAlto);
        sb.append(", capacidadLargo=").append(capacidadLargo);
        sb.append(", capacidadAncho=").append(capacidadAncho);
        sb.append("]");
        return sb.toString();
    }
}