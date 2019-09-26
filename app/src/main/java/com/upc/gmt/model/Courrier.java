package com.upc.gmt.model;

public class Courrier {
    private Integer idCourrier;

    private String descripion;

    private String direccion;

    private String observacion;

    public Courrier(Integer idCourrier, String descripion, String direccion, String observacion) {
        this.idCourrier = idCourrier;
        this.descripion = descripion;
        this.direccion = direccion;
        this.observacion = observacion;
    }

    public Courrier() {
        super();
    }

    public Integer getIdCourrier() {
        return idCourrier;
    }

    public void setIdCourrier(Integer idCourrier) {
        this.idCourrier = idCourrier;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion == null ? null : descripion.trim();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion == null ? null : direccion.trim();
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion == null ? null : observacion.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idCourrier=").append(idCourrier);
        sb.append(", descripion=").append(descripion);
        sb.append(", direccion=").append(direccion);
        sb.append(", observacion=").append(observacion);
        sb.append("]");
        return sb.toString();
    }
}