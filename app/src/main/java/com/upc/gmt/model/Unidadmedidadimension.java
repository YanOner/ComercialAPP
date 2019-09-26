package com.upc.gmt.model;

public class Unidadmedidadimension {
    private Integer idUMD;

    private String descripcion;

    private String codigo;

    public Unidadmedidadimension(Integer idUMD, String descripcion, String codigo) {
        this.idUMD = idUMD;
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    public Unidadmedidadimension() {
        super();
    }

    public Integer getIdUMD() {
        return idUMD;
    }

    public void setIdUMD(Integer idUMD) {
        this.idUMD = idUMD;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo == null ? null : codigo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idUMD=").append(idUMD);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", codigo=").append(codigo);
        sb.append("]");
        return sb.toString();
    }
}