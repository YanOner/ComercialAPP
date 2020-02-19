package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.Date;

public class Venta {
    private Integer idventa; // Integer // Id or Primary Key
    private Date fechaventa;  // Date
    private String nrodocumentocli;  // String

    private BigDecimal subtotal;  // BigDecimal

    private BigDecimal igv;  // BigDecimal

    private BigDecimal descuentototal;  // BigDecimal

    private BigDecimal total;  // BigDecimal

    private BigDecimal totalcostoenvio;  // BigDecimal

    private BigDecimal totalventa;  // BigDecimal

    private Integer nrocuotas;  // Integer
    private Integer idfomapago;  // Integer
    private String nrocuenta;  // String

    private BigDecimal subtotalfinal;  // BigDecimal

    private BigDecimal igvfinal;  // BigDecimal

    private BigDecimal descuentototalfinal;  // BigDecimal

    private BigDecimal totalfinal;  // BigDecimal

    private BigDecimal totalventafinal;  // BigDecimal
    private String estado;  // String
    private String usuariomodifico;  // String

    private Date fechamodifico;  // Date
    private String usuarioanulo;  // String

    private Date fechaanulo;  // Date
    private Integer idestado;  // Integer
    private String codusuario;  // String

    public Integer getIdventa() {
        return idventa;
    }

    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }

    public Date getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(Date fechaventa) {
        this.fechaventa = fechaventa;
    }

    public String getNrodocumentocli() {
        return nrodocumentocli;
    }

    public void setNrodocumentocli(String nrodocumentocli) {
        this.nrodocumentocli = nrodocumentocli;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public BigDecimal getDescuentototal() {
        return descuentototal;
    }

    public void setDescuentototal(BigDecimal descuentototal) {
        this.descuentototal = descuentototal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getTotalcostoenvio() {
        return totalcostoenvio;
    }

    public void setTotalcostoenvio(BigDecimal totalcostoenvio) {
        this.totalcostoenvio = totalcostoenvio;
    }

    public BigDecimal getTotalventa() {
        return totalventa;
    }

    public void setTotalventa(BigDecimal totalventa) {
        this.totalventa = totalventa;
    }

    public Integer getNrocuotas() {
        return nrocuotas;
    }

    public void setNrocuotas(Integer nrocuotas) {
        this.nrocuotas = nrocuotas;
    }

    public Integer getIdfomapago() {
        return idfomapago;
    }

    public void setIdfomapago(Integer idfomapago) {
        this.idfomapago = idfomapago;
    }

    public String getNrocuenta() {
        return nrocuenta;
    }

    public void setNrocuenta(String nrocuenta) {
        this.nrocuenta = nrocuenta;
    }

    public BigDecimal getSubtotalfinal() {
        return subtotalfinal;
    }

    public void setSubtotalfinal(BigDecimal subtotalfinal) {
        this.subtotalfinal = subtotalfinal;
    }

    public BigDecimal getIgvfinal() {
        return igvfinal;
    }

    public void setIgvfinal(BigDecimal igvfinal) {
        this.igvfinal = igvfinal;
    }

    public BigDecimal getDescuentototalfinal() {
        return descuentototalfinal;
    }

    public void setDescuentototalfinal(BigDecimal descuentototalfinal) {
        this.descuentototalfinal = descuentototalfinal;
    }

    public BigDecimal getTotalfinal() {
        return totalfinal;
    }

    public void setTotalfinal(BigDecimal totalfinal) {
        this.totalfinal = totalfinal;
    }

    public BigDecimal getTotalventafinal() {
        return totalventafinal;
    }

    public void setTotalventafinal(BigDecimal totalventafinal) {
        this.totalventafinal = totalventafinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuariomodifico() {
        return usuariomodifico;
    }

    public void setUsuariomodifico(String usuariomodifico) {
        this.usuariomodifico = usuariomodifico;
    }

    public Date getFechamodifico() {
        return fechamodifico;
    }

    public void setFechamodifico(Date fechamodifico) {
        this.fechamodifico = fechamodifico;
    }

    public String getUsuarioanulo() {
        return usuarioanulo;
    }

    public void setUsuarioanulo(String usuarioanulo) {
        this.usuarioanulo = usuarioanulo;
    }

    public Date getFechaanulo() {
        return fechaanulo;
    }

    public void setFechaanulo(Date fechaanulo) {
        this.fechaanulo = fechaanulo;
    }

    public Integer getIdestado() {
        return idestado;
    }

    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
    }

    public String getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(String codusuario) {
        this.codusuario = codusuario;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idventa=" + idventa +
                ", fechaventa=" + fechaventa +
                ", nrodocumentocli='" + nrodocumentocli + '\'' +
                ", subtotal=" + subtotal +
                ", igv=" + igv +
                ", descuentototal=" + descuentototal +
                ", total=" + total +
                ", totalcostoenvio=" + totalcostoenvio +
                ", totalventa=" + totalventa +
                ", nrocuotas=" + nrocuotas +
                ", idfomapago=" + idfomapago +
                ", nrocuenta='" + nrocuenta + '\'' +
                ", subtotalfinal=" + subtotalfinal +
                ", igvfinal=" + igvfinal +
                ", descuentototalfinal=" + descuentototalfinal +
                ", totalfinal=" + totalfinal +
                ", totalventafinal=" + totalventafinal +
                ", estado='" + estado + '\'' +
                ", usuariomodifico='" + usuariomodifico + '\'' +
                ", fechamodifico=" + fechamodifico +
                ", usuarioanulo='" + usuarioanulo + '\'' +
                ", fechaanulo=" + fechaanulo +
                ", idestado=" + idestado +
                ", codusuario='" + codusuario + '\'' +
                '}';
    }
}