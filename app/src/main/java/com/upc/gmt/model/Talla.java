package com.upc.gmt.model;

public class Talla {
    private Integer nroTalla;

    private String estado;

    public Talla(Integer nroTalla, String estado) {
        this.nroTalla = nroTalla;
        this.estado = estado;
    }

    public Talla() {
        super();
    }

    public Integer getNroTalla() {
        return nroTalla;
    }

    public void setNroTalla(Integer nroTalla) {
        this.nroTalla = nroTalla;
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
        sb.append(", nroTalla=").append(nroTalla);
        sb.append(", estado=").append(estado);
        sb.append("]");
        return sb.toString();
    }
}