package com.upc.gmt.model;

public class Bancos {
    private Integer idBancos;

    private String descripcion;

    private String nroCuenta;

    private String estado;

    public Bancos(Integer idBancos, String descripcion, String nroCuenta, String estado) {
        this.idBancos = idBancos;
        this.descripcion = descripcion;
        this.nroCuenta = nroCuenta;
        this.estado = estado;
    }

    public Bancos() {
        super();
    }

    public Integer getIdBancos() {
        return idBancos;
    }

    public void setIdBancos(Integer idBancos) {
        this.idBancos = idBancos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta == null ? null : nroCuenta.trim();
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
        sb.append(", idBancos=").append(idBancos);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", nroCuenta=").append(nroCuenta);
        sb.append(", estado=").append(estado);
        sb.append("]");
        return sb.toString();
    }
}