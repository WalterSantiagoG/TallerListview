package com.example.santiago.tallerlistview;

import java.util.ArrayList;

/**
 * Created by SANTIAGO on 1/10/2017.
 */

public class Datos {
    private static ArrayList<Operacion> operaciones = new ArrayList<>();

    public static void guardar(Operacion o){

        operaciones.add(o);
    }

    public static ArrayList<Operacion> Obtener() {

        return operaciones;

    }
}
