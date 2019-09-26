package com.upc.gmt.model;

public class Direccion {
    private Integer idDireccion;

    private Integer idCliente;

    private String descripcion;

    private String referencia;

    private String telefono;

    private String distrito;

    private String provincia;

    private String departamento;

    public Direccion(Integer idDireccion, Integer idCliente, String descripcion, String referencia, String telefono, String distrito, String provincia, String departamento) {
        this.idDireccion = idDireccion;
        this.idCliente = idCliente;
        this.descripcion = descripcion;
        this.referencia = referencia;
        this.telefono = telefono;
        this.distrito = distrito;
        this.provincia = provincia;
        this.departamento = departamento;
    }

    public Direccion() {
        super();
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion == null ? null : descripcion.trim();
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia == null ? null : referencia.trim();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono == null ? null : telefono.trim();
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito == null ? null : distrito.trim();
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia == null ? null : provincia.trim();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento == null ? null : departamento.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idDireccion=").append(idDireccion);
        sb.append(", idCliente=").append(idCliente);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", referencia=").append(referencia);
        sb.append(", telefono=").append(telefono);
        sb.append(", distrito=").append(distrito);
        sb.append(", provincia=").append(provincia);
        sb.append(", departamento=").append(departamento);
        sb.append("]");
        return sb.toString();
    }
}