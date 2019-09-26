package com.upc.gmt.model;

public class Partesproducto {
    private Integer idComponente;

    private Integer idProducto;

    private Integer idMaterial;

    private String descripcion;

    public Partesproducto(Integer idComponente, Integer idProducto, Integer idMaterial, String descripcion) {
        this.idComponente = idComponente;
        this.idProducto = idProducto;
        this.idMaterial = idMaterial;
        this.descripcion = descripcion;
    }

    public Partesproducto() {
        super();
    }

    public Integer getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idComponente=").append(idComponente);
        sb.append(", idProducto=").append(idProducto);
        sb.append(", idMaterial=").append(idMaterial);
        sb.append(", descripcion=").append(descripcion);
        sb.append("]");
        return sb.toString();
    }
}