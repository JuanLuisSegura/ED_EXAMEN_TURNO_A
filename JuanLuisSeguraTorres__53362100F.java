/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juanluisseguratorres__53362100f;

import java.util.*;

/**
 * Ejercico práctico examen EVAL 1 ED
 *
 * @author juanl
 * @version 1.0
 */
public class JuanLuisSeguraTorres__53362100F {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;
    /**
     * Constructor con tres parámetros
     * 
     * @param nombreCompleto nombre completo en mayÃºsculas
     * @param dni documento nacional de identidad con letras y sin espacios
     */

    public JuanLuisSeguraTorres__53362100F(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }
    /**
     * Calcula el salario bruto mensual en funciÃ³n del salario base por hora y las horas extras 
     * El precio por hora de la hora extra se determina con la constante FACTOR_HORA_EXTRA
     * 
     * @param horasExtra horasExtra número de horas extra dedicadas redondeado a la baja(entero)
     * 
     * @return devuelve el salario bruto mensual en euros con dos decimales
     */

    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora
                * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        // !!!! MODIFICA TU NOMBRE Y TU DNI EN LA SIGUIENTE LíNEA
        JuanLuisSeguraTorres__53362100F emp = new JuanLuisSeguraTorres__53362100F("JUAN lUIS SEGURA TORRES",
                "53362100F");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)
                + " euros, al hacer " + horasExtra + " horas extra.");
    }
}
