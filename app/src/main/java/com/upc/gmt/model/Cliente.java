package com.upc.gmt.model;

import java.util.Date;

public class Cliente {
    private Integer idCliente;

    private String nombres;

    private String apellidoPaterno;

    private String apellidoMaterno;

    private Date fechaNacimiento;

    private String estado;

    private String nroDocumentoIdentidad;

    private String RUC;

    private String celular;

    private Date fechaCreacion;

    private Double lineaCreditoActual;

    private Double saldoLineaCredito;

    public Cliente(Integer idCliente, String nombres, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento, String estado, String nroDocumentoIdentidad, String RUC, String celular, Date fechaCreacion, Double lineaCreditoActual, Double saldoLineaCredito) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.nroDocumentoIdentidad = nroDocumentoIdentidad;
        this.RUC = RUC;
        this.celular = celular;
        this.fechaCreacion = fechaCreacion;
        this.lineaCreditoActual = lineaCreditoActual;
        this.saldoLineaCredito = saldoLineaCredito;
    }

    public Cliente() {
        super();
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres == null ? null : nombres.trim();
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno == null ? null : apellidoPaterno.trim();
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno == null ? null : apellidoMaterno.trim();
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado == null ? null : estado.trim();
    }

    public String getNroDocumentoIdentidad() {
        return nroDocumentoIdentidad;
    }

    public void setNroDocumentoIdentidad(String nroDocumentoIdentidad) {
        this.nroDocumentoIdentidad = nroDocumentoIdentidad == null ? null : nroDocumentoIdentidad.trim();
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC == null ? null : RUC.trim();
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular == null ? null : celular.trim();
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Double getLineaCreditoActual() {
        return lineaCreditoActual;
    }

    public void setLineaCreditoActual(Double lineaCreditoActual) {
        this.lineaCreditoActual = lineaCreditoActual;
    }

    public Double getSaldoLineaCredito() {
        return saldoLineaCredito;
    }

    public void setSaldoLineaCredito(Double saldoLineaCredito) {
        this.saldoLineaCredito = saldoLineaCredito;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idCliente=").append(idCliente);
        sb.append(", nombres=").append(nombres);
        sb.append(", apellidoPaterno=").append(apellidoPaterno);
        sb.append(", apellidoMaterno=").append(apellidoMaterno);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", estado=").append(estado);
        sb.append(", nroDocumentoIdentidad=").append(nroDocumentoIdentidad);
        sb.append(", RUC=").append(RUC);
        sb.append(", celular=").append(celular);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", lineaCreditoActual=").append(lineaCreditoActual);
        sb.append(", saldoLineaCredito=").append(saldoLineaCredito);
        sb.append("]");
        return sb.toString();
    }
}