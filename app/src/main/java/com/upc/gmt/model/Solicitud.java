package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.Date;

public class Solicitud {
    private Integer idsolicitud; // Integer // Id or Primary Key

    private String codusuario;  // String
    private Integer idtiposolicitud;  // Integer
    private Integer idestadosolicitud;  // Integer

    private Date fechasolicitud;  // Date
    private String comentario;  // String

    private BigDecimal montocomprapromedio;  // BigDecimal

    private BigDecimal montoincrementocredito;  // BigDecimal
    private String usuariogenerosolicitud;  // String

    private Date fecharespuesta;  // Date
    private String usuariorespuesta;  // String
    private String estado;  // String

    private BigDecimal lineacredito;  // BigDecimal

    private BigDecimal lineacreditoanterior;  // BigDecimal

    public Integer getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(Integer idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public String getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(String codusuario) {
        this.codusuario = codusuario;
    }

    public Integer getIdtiposolicitud() {
        return idtiposolicitud;
    }

    public void setIdtiposolicitud(Integer idtiposolicitud) {
        this.idtiposolicitud = idtiposolicitud;
    }

    public Integer getIdestadosolicitud() {
        return idestadosolicitud;
    }

    public void setIdestadosolicitud(Integer idestadosolicitud) {
        this.idestadosolicitud = idestadosolicitud;
    }

    public Date getFechasolicitud() {
        return fechasolicitud;
    }

    public void setFechasolicitud(Date fechasolicitud) {
        this.fechasolicitud = fechasolicitud;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public BigDecimal getMontocomprapromedio() {
        return montocomprapromedio;
    }

    public void setMontocomprapromedio(BigDecimal montocomprapromedio) {
        this.montocomprapromedio = montocomprapromedio;
    }

    public BigDecimal getMontoincrementocredito() {
        return montoincrementocredito;
    }

    public void setMontoincrementocredito(BigDecimal montoincrementocredito) {
        this.montoincrementocredito = montoincrementocredito;
    }

    public String getUsuariogenerosolicitud() {
        return usuariogenerosolicitud;
    }

    public void setUsuariogenerosolicitud(String usuariogenerosolicitud) {
        this.usuariogenerosolicitud = usuariogenerosolicitud;
    }

    public Date getFecharespuesta() {
        return fecharespuesta;
    }

    public void setFecharespuesta(Date fecharespuesta) {
        this.fecharespuesta = fecharespuesta;
    }

    public String getUsuariorespuesta() {
        return usuariorespuesta;
    }

    public void setUsuariorespuesta(String usuariorespuesta) {
        this.usuariorespuesta = usuariorespuesta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getLineacredito() {
        return lineacredito;
    }

    public void setLineacredito(BigDecimal lineacredito) {
        this.lineacredito = lineacredito;
    }

    public BigDecimal getLineacreditoanterior() {
        return lineacreditoanterior;
    }

    public void setLineacreditoanterior(BigDecimal lineacreditoanterior) {
        this.lineacreditoanterior = lineacreditoanterior;
    }
}
