package com.johnandrade.reto4.modelo.vo;

public class Requerimiento_3 {
    private int idProyecto;
    private String ciudad;
    private String clasificacion;
    private int costoProyecto;

    public Requerimiento_3(){

    }

    /**
     * @return Integer return the idProyecto
     */
    public Integer getIdProyecto() {
        return idProyecto;
    }

    /**
     * @param idProyecto the idProyecto to set
     */
    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    /**
     * @return String return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return String return the clasificacion
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * @return Integer return the costoProyecto
     */
    public Integer getCostoProyecto() {
        return costoProyecto;
    }

    /**
     * @param costoProyecto the costoProyecto to set
     */
    public void setCostoProyecto(Integer costoProyecto) {
        this.costoProyecto = costoProyecto;
    }

}
