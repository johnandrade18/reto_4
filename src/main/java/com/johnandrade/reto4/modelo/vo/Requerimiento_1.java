package com.johnandrade.reto4.modelo.vo;

public class Requerimiento_1 {
    private String lider;
    private String cargo;
    private Integer proyectos;

    public Requerimiento_1(){

    }

    /**
     * @return String return the lider
     */
    public String getLider() {
        return lider;
    }

    /**
     * @param lider the lider to set
     */
    public void setLider(String lider) {
        this.lider = lider;
    }

    /**
     * @return String return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return Integer return the proyectos
     */
    public Integer getProyectos() {
        return proyectos;
    }

    /**
     * @param proyectos the proyectos to set
     */
    public void setProyectos(Integer proyectos) {
        this.proyectos = proyectos;
    }

}
