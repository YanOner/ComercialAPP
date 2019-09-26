package com.upc.gmt.model;

public class Tipousuario {
    private Integer idTipoUsuario;

    private String descripion;

    private String estado;

    public Tipousuario(Integer idTipoUsuario, String descripion, String estado) {
        this.idTipoUsuario = idTipoUsuario;
        this.descripion = descripion;
        this.estado = estado;
    }

    public Tipousuario() {
        super();
    }

    public Integer getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion == null ? null : descripion.trim();
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
        sb.append(", idTipoUsuario=").append(idTipoUsuario);
        sb.append(", descripion=").append(descripion);
        sb.append(", estado=").append(estado);
        sb.append("]");
        return sb.toString();
    }
}