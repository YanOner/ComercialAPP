package com.upc.gmt.model;

import java.math.BigDecimal;

public class Costoubigeo {
    private String codUbigeoCosto;

    private String distrito;

    private String provincia;

    private String departamento;

    private BigDecimal costoEnvio;

    private String estado;

    public Costoubigeo(String codUbigeoCosto, String distrito, String provincia, String departamento, BigDecimal costoEnvio, String estado) {
        this.codUbigeoCosto = codUbigeoCosto;
        this.distrito = distrito;
        this.provincia = provincia;
        this.departamento = departamento;
        this.costoEnvio = costoEnvio;
        this.estado = estado;
    }

    public Costoubigeo() {
        super();
    }

    public String getCodUbigeoCosto() {
        return codUbigeoCosto;
    }

    public void setCodUbigeoCosto(String codUbigeoCosto) {
        this.codUbigeoCosto = codUbigeoCosto == null ? null : codUbigeoCosto.trim();
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

    public BigDecimal getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(BigDecimal costoEnvio) {
        this.costoEnvio = costoEnvio;
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
        sb.append(", codUbigeoCosto=").append(codUbigeoCosto);
        sb.append(", distrito=").append(distrito);
        sb.append(", provincia=").append(provincia);
        sb.append(", departamento=").append(departamento);
        sb.append(", costoEnvio=").append(costoEnvio);
        sb.append(", estado=").append(estado);
        sb.append("]");
        return sb.toString();
    }
}