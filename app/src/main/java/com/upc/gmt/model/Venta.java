package com.upc.gmt.model;

import java.math.BigDecimal;
import java.util.Date;

public class Venta {
    private Integer idVenta;

    private Integer idCliente;

    private Date fechaVenta;

    private BigDecimal subTotal;

    private BigDecimal IGV;

    private BigDecimal descuento;

    private BigDecimal total;

    private BigDecimal montoEntrega;

    private BigDecimal totalVenta;

    private Integer nroCuotas;

    private String tipoRecojo;

    private String usuarioModifico;

    private Date fechaModifico;

    private String usuarioAnulo;

    private Date fechaAnulo;

    private String numOperaBancaria;

    private Date fechaOperaBancaria;

    private String codTrxTarjeta;

    private Date fechTrxTarjeta;

    private String estado;

    private String codUbigeoCosto;

    private Integer idFomaPago;

    private Integer idCuponDescuento;

    private String direccionEntrega;

    private Integer idEstadoVenta;

    private Integer idBancos;

    private String nroCuenta;

    public Venta(Integer idVenta, Integer idCliente, Date fechaVenta, BigDecimal subTotal, BigDecimal IGV, BigDecimal descuento, BigDecimal total, BigDecimal montoEntrega, BigDecimal totalVenta, Integer nroCuotas, String tipoRecojo, String usuarioModifico, Date fechaModifico, String usuarioAnulo, Date fechaAnulo, String numOperaBancaria, Date fechaOperaBancaria, String codTrxTarjeta, Date fechTrxTarjeta, String estado, String codUbigeoCosto, Integer idFomaPago, Integer idCuponDescuento, String direccionEntrega, Integer idEstadoVenta, Integer idBancos, String nroCuenta) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.fechaVenta = fechaVenta;
        this.subTotal = subTotal;
        this.IGV = IGV;
        this.descuento = descuento;
        this.total = total;
        this.montoEntrega = montoEntrega;
        this.totalVenta = totalVenta;
        this.nroCuotas = nroCuotas;
        this.tipoRecojo = tipoRecojo;
        this.usuarioModifico = usuarioModifico;
        this.fechaModifico = fechaModifico;
        this.usuarioAnulo = usuarioAnulo;
        this.fechaAnulo = fechaAnulo;
        this.numOperaBancaria = numOperaBancaria;
        this.fechaOperaBancaria = fechaOperaBancaria;
        this.codTrxTarjeta = codTrxTarjeta;
        this.fechTrxTarjeta = fechTrxTarjeta;
        this.estado = estado;
        this.codUbigeoCosto = codUbigeoCosto;
        this.idFomaPago = idFomaPago;
        this.idCuponDescuento = idCuponDescuento;
        this.direccionEntrega = direccionEntrega;
        this.idEstadoVenta = idEstadoVenta;
        this.idBancos = idBancos;
        this.nroCuenta = nroCuenta;
    }

    public Venta() {
        super();
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getIGV() {
        return IGV;
    }

    public void setIGV(BigDecimal IGV) {
        this.IGV = IGV;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getMontoEntrega() {
        return montoEntrega;
    }

    public void setMontoEntrega(BigDecimal montoEntrega) {
        this.montoEntrega = montoEntrega;
    }

    public BigDecimal getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(BigDecimal totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Integer getNroCuotas() {
        return nroCuotas;
    }

    public void setNroCuotas(Integer nroCuotas) {
        this.nroCuotas = nroCuotas;
    }

    public String getTipoRecojo() {
        return tipoRecojo;
    }

    public void setTipoRecojo(String tipoRecojo) {
        this.tipoRecojo = tipoRecojo == null ? null : tipoRecojo.trim();
    }

    public String getUsuarioModifico() {
        return usuarioModifico;
    }

    public void setUsuarioModifico(String usuarioModifico) {
        this.usuarioModifico = usuarioModifico == null ? null : usuarioModifico.trim();
    }

    public Date getFechaModifico() {
        return fechaModifico;
    }

    public void setFechaModifico(Date fechaModifico) {
        this.fechaModifico = fechaModifico;
    }

    public String getUsuarioAnulo() {
        return usuarioAnulo;
    }

    public void setUsuarioAnulo(String usuarioAnulo) {
        this.usuarioAnulo = usuarioAnulo == null ? null : usuarioAnulo.trim();
    }

    public Date getFechaAnulo() {
        return fechaAnulo;
    }

    public void setFechaAnulo(Date fechaAnulo) {
        this.fechaAnulo = fechaAnulo;
    }

    public String getNumOperaBancaria() {
        return numOperaBancaria;
    }

    public void setNumOperaBancaria(String numOperaBancaria) {
        this.numOperaBancaria = numOperaBancaria == null ? null : numOperaBancaria.trim();
    }

    public Date getFechaOperaBancaria() {
        return fechaOperaBancaria;
    }

    public void setFechaOperaBancaria(Date fechaOperaBancaria) {
        this.fechaOperaBancaria = fechaOperaBancaria;
    }

    public String getCodTrxTarjeta() {
        return codTrxTarjeta;
    }

    public void setCodTrxTarjeta(String codTrxTarjeta) {
        this.codTrxTarjeta = codTrxTarjeta == null ? null : codTrxTarjeta.trim();
    }

    public Date getFechTrxTarjeta() {
        return fechTrxTarjeta;
    }

    public void setFechTrxTarjeta(Date fechTrxTarjeta) {
        this.fechTrxTarjeta = fechTrxTarjeta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado == null ? null : estado.trim();
    }

    public String getCodUbigeoCosto() {
        return codUbigeoCosto;
    }

    public void setCodUbigeoCosto(String codUbigeoCosto) {
        this.codUbigeoCosto = codUbigeoCosto == null ? null : codUbigeoCosto.trim();
    }

    public Integer getIdFomaPago() {
        return idFomaPago;
    }

    public void setIdFomaPago(Integer idFomaPago) {
        this.idFomaPago = idFomaPago;
    }

    public Integer getIdCuponDescuento() {
        return idCuponDescuento;
    }

    public void setIdCuponDescuento(Integer idCuponDescuento) {
        this.idCuponDescuento = idCuponDescuento;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega == null ? null : direccionEntrega.trim();
    }

    public Integer getIdEstadoVenta() {
        return idEstadoVenta;
    }

    public void setIdEstadoVenta(Integer idEstadoVenta) {
        this.idEstadoVenta = idEstadoVenta;
    }

    public Integer getIdBancos() {
        return idBancos;
    }

    public void setIdBancos(Integer idBancos) {
        this.idBancos = idBancos;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta == null ? null : nroCuenta.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idVenta=").append(idVenta);
        sb.append(", idCliente=").append(idCliente);
        sb.append(", fechaVenta=").append(fechaVenta);
        sb.append(", subTotal=").append(subTotal);
        sb.append(", IGV=").append(IGV);
        sb.append(", descuento=").append(descuento);
        sb.append(", total=").append(total);
        sb.append(", montoEntrega=").append(montoEntrega);
        sb.append(", totalVenta=").append(totalVenta);
        sb.append(", nroCuotas=").append(nroCuotas);
        sb.append(", tipoRecojo=").append(tipoRecojo);
        sb.append(", usuarioModifico=").append(usuarioModifico);
        sb.append(", fechaModifico=").append(fechaModifico);
        sb.append(", usuarioAnulo=").append(usuarioAnulo);
        sb.append(", fechaAnulo=").append(fechaAnulo);
        sb.append(", numOperaBancaria=").append(numOperaBancaria);
        sb.append(", fechaOperaBancaria=").append(fechaOperaBancaria);
        sb.append(", codTrxTarjeta=").append(codTrxTarjeta);
        sb.append(", fechTrxTarjeta=").append(fechTrxTarjeta);
        sb.append(", estado=").append(estado);
        sb.append(", codUbigeoCosto=").append(codUbigeoCosto);
        sb.append(", idFomaPago=").append(idFomaPago);
        sb.append(", idCuponDescuento=").append(idCuponDescuento);
        sb.append(", direccionEntrega=").append(direccionEntrega);
        sb.append(", idEstadoVenta=").append(idEstadoVenta);
        sb.append(", idBancos=").append(idBancos);
        sb.append(", nroCuenta=").append(nroCuenta);
        sb.append("]");
        return sb.toString();
    }
}