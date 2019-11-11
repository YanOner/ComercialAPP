package com.upc.gmt.bean;

import java.math.BigDecimal;

public class Costoubigeo {
    private String codubigeocosto; // String // Id or Primary Key

    private String distrito;  // String
    private String provincia;  // String
    private String departamento;  // String

    private BigDecimal costoenvio;  // BigDecimal
    private String estado;

    public Costoubigeo(String codubigeocosto, String distrito, String provincia, String departamento, BigDecimal costoenvio, String estado) {
        this.codubigeocosto = codubigeocosto;
        this.distrito = distrito;
        this.provincia = provincia;
        this.departamento = departamento;
        this.costoenvio = costoenvio;
        this.estado = estado;
    }

    public Costoubigeo() {
        super();
    }

    public String getCodubigeocosto() {
        return codubigeocosto;
    }

    public void setCodubigeocosto(String codubigeocosto) {
        this.codubigeocosto = codubigeocosto == null ? null : codubigeocosto.trim();
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito == null ? null : distrito.trim();
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia == null ? null : provincia.trim();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento == null ? null : departamento.trim();
    }

    public BigDecimal getCostoenvio() {
        return costoenvio;
    }

    public void setCostoenvio(BigDecimal costoenvio) {
        this.costoenvio = costoenvio;
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
        sb.append(", codubigeocosto=").append(codubigeocosto);
        sb.append(", distrito=").append(distrito);
        sb.append(", provincia=").append(provincia);
        sb.append(", departamento=").append(departamento);
        sb.append(", costoenvio=").append(costoenvio);
        sb.append(", estado=").append(estado);
        sb.append("]");
        return sb.toString();
    }
}