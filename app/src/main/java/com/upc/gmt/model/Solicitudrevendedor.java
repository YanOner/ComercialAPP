package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.Date;

public class Solicitudrevendedor {
    private Integer idSolicitud;

    private Integer idCliente;

    private String codUsuario;

    private Date fechaSolicitud;

    private String comentario;

    private BigDecimal montoCompraPromedio;

    private String usuarioGeneroSolicitud;

    private Date fechaRespuesta;

    private String usuarioRespuesta;

    private String estado;

    private BigDecimal lineaCredito;

    private BigDecimal lineaCreditoAnterior;

    public Solicitudrevendedor(Integer idSolicitud, Integer idCliente, String codUsuario, Date fechaSolicitud, String comentario, BigDecimal montoCompraPromedio, String usuarioGeneroSolicitud, Date fechaRespuesta, String usuarioRespuesta, String estado, BigDecimal lineaCredito, BigDecimal lineaCreditoAnterior) {
        this.idSolicitud = idSolicitud;
        this.idCliente = idCliente;
        this.codUsuario = codUsuario;
        this.fechaSolicitud = fechaSolicitud;
        this.comentario = comentario;
        this.montoCompraPromedio = montoCompraPromedio;
        this.usuarioGeneroSolicitud = usuarioGeneroSolicitud;
        this.fechaRespuesta = fechaRespuesta;
        this.usuarioRespuesta = usuarioRespuesta;
        this.estado = estado;
        this.lineaCredito = lineaCredito;
        this.lineaCreditoAnterior = lineaCreditoAnterior;
    }

    public Solicitudrevendedor() {
        super();
    }

    public Integer getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario == null ? null : codUsuario.trim();
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario == null ? null : comentario.trim();
    }

    public BigDecimal getMontoCompraPromedio() {
        return montoCompraPromedio;
    }

    public void setMontoCompraPromedio(BigDecimal montoCompraPromedio) {
        this.montoCompraPromedio = montoCompraPromedio;
    }

    public String getUsuarioGeneroSolicitud() {
        return usuarioGeneroSolicitud;
    }

    public void setUsuarioGeneroSolicitud(String usuarioGeneroSolicitud) {
        this.usuarioGeneroSolicitud = usuarioGeneroSolicitud == null ? null : usuarioGeneroSolicitud.trim();
    }

    public Date getFechaRespuesta() {
        return fechaRespuesta;
    }

    public void setFechaRespuesta(Date fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    public String getUsuarioRespuesta() {
        return usuarioRespuesta;
    }

    public void setUsuarioRespuesta(String usuarioRespuesta) {
        this.usuarioRespuesta = usuarioRespuesta == null ? null : usuarioRespuesta.trim();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado == null ? null : estado.trim();
    }

    public BigDecimal getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(BigDecimal lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public BigDecimal getLineaCreditoAnterior() {
        return lineaCreditoAnterior;
    }

    public void setLineaCreditoAnterior(BigDecimal lineaCreditoAnterior) {
        this.lineaCreditoAnterior = lineaCreditoAnterior;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idSolicitud=").append(idSolicitud);
        sb.append(", idCliente=").append(idCliente);
        sb.append(", codUsuario=").append(codUsuario);
        sb.append(", fechaSolicitud=").append(fechaSolicitud);
        sb.append(", comentario=").append(comentario);
        sb.append(", montoCompraPromedio=").append(montoCompraPromedio);
        sb.append(", usuarioGeneroSolicitud=").append(usuarioGeneroSolicitud);
        sb.append(", fechaRespuesta=").append(fechaRespuesta);
        sb.append(", usuarioRespuesta=").append(usuarioRespuesta);
        sb.append(", estado=").append(estado);
        sb.append(", lineaCredito=").append(lineaCredito);
        sb.append(", lineaCreditoAnterior=").append(lineaCreditoAnterior);
        sb.append("]");
        return sb.toString();
    }
}