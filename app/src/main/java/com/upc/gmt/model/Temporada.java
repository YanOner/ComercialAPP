package com.upc.gmt.model;

public class Temporada {
    private Integer idTemporada;

    private String descripcion;

    private String estado;

    public Temporada(Integer idTemporada, String descripcion, String estado) {
        this.idTemporada = idTemporada;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Temporada() {
        super();
    }

    public Integer getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(Integer idTemporada) {
        this.idTemporada = idTemporada;
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
        sb.append(", idTemporada=").append(idTemporada);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", estado=").append(estado);
        sb.append("]");
        return sb.toString();
    }
}