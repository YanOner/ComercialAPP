package com.upc.gmt.model;

public class Fomapago {
    private Integer idFomaPago;

    private String descripcion;

    private String estado;

    public Fomapago(Integer idFomaPago, String descripcion, String estado) {
        this.idFomaPago = idFomaPago;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Fomapago() {
        super();
    }

    public Integer getIdFomaPago() {
        return idFomaPago;
    }

    public void setIdFomaPago(Integer idFomaPago) {
        this.idFomaPago = idFomaPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
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
        sb.append(", idFomaPago=").append(idFomaPago);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", estado=").append(estado);
        sb.append("]");
        return sb.toString();
    }
}