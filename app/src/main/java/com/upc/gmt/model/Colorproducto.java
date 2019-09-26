package com.upc.gmt.model;

public class Colorproducto {
    private Integer idColorProducto;

    private String color;

    private String idEstado;

    public Colorproducto(Integer idColorProducto, String color, String idEstado) {
        this.idColorProducto = idColorProducto;
        this.color = color;
        this.idEstado = idEstado;
    }

    public Colorproducto() {
        super();
    }

    public Integer getIdColorProducto() {
        return idColorProducto;
    }

    public void setIdColorProducto(Integer idColorProducto) {
        this.idColorProducto = idColorProducto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado == null ? null : idEstado.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idColorProducto=").append(idColorProducto);
        sb.append(", color=").append(color);
        sb.append(", idEstado=").append(idEstado);
        sb.append("]");
        return sb.toString();
    }
}