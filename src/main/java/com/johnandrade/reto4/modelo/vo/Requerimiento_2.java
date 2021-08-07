package com.johnandrade.reto4.modelo.vo;

public class Requerimiento_2 {
    private Integer idMaterial;
    private String nombreMaterial;
    private Integer cantidad;
    private Integer precioUnidad;
    private Integer precioTotal;

    public  Requerimiento_2(){

    }

    /**
     * @return ouble return the idMaterial
     */
    public Integer getIdMaterial() {
        return idMaterial;
    }

    /**
     * @param idMaterial the idMaterial to set
     */
    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    /**
     * @return String return the nombreMaterial
     */
    public String getNombreMaterial() {
        return nombreMaterial;
    }

    /**
     * @param nombreMaterial the nombreMaterial to set
     */
    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    /**
     * @return Integer return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return Integer return the precioUnidad
     */
    public Integer getPrecioUnidad() {
        return precioUnidad;
    }

    /**
     * @param precioUnidad the precioUnidad to set
     */
    public void setPrecioUnidad(Integer precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    /**
     * @return Integer return the precioTotal
     */
    public Integer getPrecioTotal() {
        return precioTotal;
    }

    /**
     * @param precioTotal the precioTotal to set
     */
    public void setPrecioTotal(Integer precioTotal) {
        this.precioTotal = precioTotal;
    }

}
