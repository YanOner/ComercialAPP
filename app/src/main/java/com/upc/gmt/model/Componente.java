package com.upc.gmt.model;

public class Componente {
    private Integer idComponente;

    private String descComponente;

    private String estado;

    public Componente(Integer idComponente, String descComponente, String estado) {
        this.idComponente = idComponente;
        this.descComponente = descComponente;
        this.estado = estado;
    }

    public Componente() {
        super();
    }

    public Integer getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(Integer idComponente) {
        this.idComponente = idComponente;
    }

    public String getDescComponente() {
        return descComponente;
    }

    public void setDescComponente(String descComponente) {
        this.descComponente = descComponente == null ? null : descComponente.trim();
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
        sb.append(", idComponente=").append(idComponente);
        sb.append(", descComponente=").append(descComponente);
        sb.append(", estado=").append(estado);
        sb.append("]");
        return sb.toString();
    }
}