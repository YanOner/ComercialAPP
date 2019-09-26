package com.upc.gmt.model;

public class Tipoproducto {
    private Integer idTipoProducto;

    private String descripcion;

    private String estado;

    public Tipoproducto(Integer idTipoProducto, String descripcion, String estado) {
        this.idTipoProducto = idTipoProducto;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Tipoproducto() {
        super();
    }

    public Integer getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
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
        sb.append(", idTipoProducto=").append(idTipoProducto);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", estado=").append(estado);
        sb.append("]");
        return sb.toString();
    }
}