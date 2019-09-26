package com.upc.gmt.model;

import java.util.Date;

public class Usuario {
    private String codUsuario;

    private Integer idCliente;

    private String password;

    private Date fechaCreacion;

    private String correoElectronico;

    private String estado;

    private Integer idTipoUsuario;

    public Usuario(String codUsuario, Integer idCliente, String password, Date fechaCreacion, String correoElectronico, String estado, Integer idTipoUsuario) {
        this.codUsuario = codUsuario;
        this.idCliente = idCliente;
        this.password = password;
        this.fechaCreacion = fechaCreacion;
        this.correoElectronico = correoElectronico;
        this.estado = estado;
        this.idTipoUsuario = idTipoUsuario;
    }

    public Usuario() {
        super();
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario == null ? null : codUsuario.trim();
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico == null ? null : correoElectronico.trim();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado == null ? null : estado.trim();
    }

    public Integer getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", codUsuario=").append(codUsuario);
        sb.append(", idCliente=").append(idCliente);
        sb.append(", password=").append(password);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", correoElectronico=").append(correoElectronico);
        sb.append(", estado=").append(estado);
        sb.append(", idTipoUsuario=").append(idTipoUsuario);
        sb.append("]");
        return sb.toString();
    }
}