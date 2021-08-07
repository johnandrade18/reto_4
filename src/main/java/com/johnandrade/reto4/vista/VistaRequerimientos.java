package com.johnandrade.reto4.vista;
import com.johnandrade.reto4.controlador.ControladorRequerimientos;
import com.johnandrade.reto4.modelo.vo.Requerimiento_1;
import com.johnandrade.reto4.modelo.vo.Requerimiento_2;
import com.johnandrade.reto4.modelo.vo.Requerimiento_3;

import java.util.ArrayList;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            ArrayList<Requerimiento_1>requerimientoN1 = controlador.consultarRequerimiento1();
            for (Requerimiento_1 requerimiento_1 : requerimientoN1) {
                System.out.printf("%s %s %d\n", requerimiento_1.getLider(), requerimiento_1.getCargo(),requerimiento_1.getProyectos());
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2>requerimientoN2 = controlador.consultarRequerimiento2();
            for (Requerimiento_2 requerimiento_2 : requerimientoN2) {
                System.out.printf("%d %s %d %d %d\n", requerimiento_2.getIdMaterial(), requerimiento_2.getNombreMaterial(),requerimiento_2.getCantidad(),requerimiento_2.getPrecioUnidad(),requerimiento_2.getPrecioTotal());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3>requerimientoN3 = controlador.consultarRequerimiento3();
            for (Requerimiento_3 requerimiento_3 : requerimientoN3) {
                System.out.printf("%d %s %s %d\n", requerimiento_3.getIdProyecto(), requerimiento_3.getCiudad(), requerimiento_3.getClasificacion(),requerimiento_3.getCostoProyecto());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
