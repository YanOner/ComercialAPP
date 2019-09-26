package com.upc.gmt.model;

/**
 * Created by MALEX on 14/09/2017.
 */

public class ProductoBean {

    private String nombre;
    private String codigo;
    private String precio;
    private String nombreImagen;
    private String listaImagenes;
    private String listaTallas;
    private String materialCalzado;
    private String materialTaco;
    private String materialForro;
    private String materialPlanta;
    private String materialPlantilla;

    public ProductoBean() {
    }

    public ProductoBean(String nombre, String codigo, String precio, String nombreImagen) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.nombreImagen = nombreImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public String getListaImagenes() {
        return listaImagenes;
    }

    public void setListaImagenes(String listaImagenes) {
        this.listaImagenes = listaImagenes;
    }

    public String getListaTallas() {
        return listaTallas;
    }

    public void setListaTallas(String listaTallas) {
        this.listaTallas = listaTallas;
    }

    public String getMaterialCalzado() {
        return materialCalzado;
    }

    public void setMaterialCalzado(String materialCalzado) {
        this.materialCalzado = materialCalzado;
    }

    public String getMaterialTaco() {
        return materialTaco;
    }

    public void setMaterialTaco(String materialTaco) {
        this.materialTaco = materialTaco;
    }

    public String getMaterialForro() {
        return materialForro;
    }

    public void setMaterialForro(String materialForro) {
        this.materialForro = materialForro;
    }

    public String getMaterialPlanta() {
        return materialPlanta;
    }

    public void setMaterialPlanta(String materialPlanta) {
        this.materialPlanta = materialPlanta;
    }

    public String getMaterialPlantilla() {
        return materialPlantilla;
    }

    public void setMaterialPlantilla(String materialPlantilla) {
        this.materialPlantilla = materialPlantilla;
    }
}
