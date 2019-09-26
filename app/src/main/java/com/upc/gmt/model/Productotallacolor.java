package com.upc.gmt.model;

public class Productotallacolor {
    private Integer idProducto;

    private Integer idColorProducto;

    private Integer nroTalla;

    private Integer stockVenta;

    private Integer stockCritico;

    private Integer stockObservado;

    private String estado;

    public Productotallacolor(Integer idProducto, Integer idColorProducto, Integer nroTalla, Integer stockVenta, Integer stockCritico, Integer stockObservado, String estado) {
        this.idProducto = idProducto;
        this.idColorProducto = idColorProducto;
        this.nroTalla = nroTalla;
        this.stockVenta = stockVenta;
        this.stockCritico = stockCritico;
        this.stockObservado = stockObservado;
        this.estado = estado;
    }

    public Productotallacolor() {
        super();
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

    public Integer getStockVenta() {
        return stockVenta;
    }

    public void setStockVenta(Integer stockVenta) {
        this.stockVenta = stockVenta;
    }

    public Integer getStockCritico() {
        return stockCritico;
    }

    public void setStockCritico(Integer stockCritico) {
        this.stockCritico = stockCritico;
    }

    public Integer getStockObservado() {
        return stockObservado;
    }

    public void setStockObservado(Integer stockObservado) {
        this.stockObservado = stockObservado;
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
        sb.append(", idProducto=").append(idProducto);
        sb.append(", idColorProducto=").append(idColorProducto);
        sb.append(", nroTalla=").append(nroTalla);
        sb.append(", stockVenta=").append(stockVenta);
        sb.append(", stockCritico=").append(stockCritico);
        sb.append(", stockObservado=").append(stockObservado);
        sb.append(", estado=").append(estado);
        sb.append("]");
        return sb.toString();
    }
}