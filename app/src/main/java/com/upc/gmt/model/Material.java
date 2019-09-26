package com.upc.gmt.model;

public class Material {
    private Integer idMaterial;

    private String descripcion;

    private String estado;

    public Material(Integer idMaterial, String descripcion, String estado) {
        this.idMaterial = idMaterial;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Material() {
        super();
    }

    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
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
        sb.append(", idMaterial=").append(idMaterial);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", estado=").append(estado);
        sb.append("]");
        return sb.toString();
    }
}