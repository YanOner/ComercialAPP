package com.upc.gmt.model;

import java.math.BigDecimal;

public class Detalleventa {
    private Integer idVenta;

    private Integer idProducto;

    private Integer idColorProducto;

    private Integer nroTalla;

    private Integer cantidad;

    private BigDecimal precioUnitario;

    private BigDecimal subTotal;

    private BigDecimal total;

    public Detalleventa(Integer idVenta, Integer idProducto, Integer idColorProducto, Integer nroTalla, Integer cantidad, BigDecimal precioUnitario, BigDecimal subTotal, BigDecimal total) {
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.idColorProducto = idColorProducto;
        this.nroTalla = nroTalla;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subTotal = subTotal;
        this.total = total;
    }

    public Detalleventa() {
        super();
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdColorProducto() {
        return idColorProducto;
    }

    public void setIdColorProducto(Integer idColorProducto) {
        this.idColorProducto = idColorProducto;
    }

    public Integer getNroTalla() {
        return nroTalla;
    }

    public void setNroTalla(Integer nroTalla) {
        this.nroTalla = nroTalla;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idVenta=").append(idVenta);
        sb.append(", idProducto=").append(idProducto);
        sb.append(", idColorProducto=").append(idColorProducto);
        sb.append(", nroTalla=").append(nroTalla);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precioUnitario=").append(precioUnitario);
        sb.append(", subTotal=").append(subTotal);
        sb.append(", total=").append(total);
        sb.append("]");
        return sb.toString();
    }
}