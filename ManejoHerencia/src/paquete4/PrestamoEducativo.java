/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete1.InstitucionEducativa;
import paquete1.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(Persona bene, int tiem, String ciu, String nivel,
            InstitucionEducativa centro, double valCar) {
        super(bene, tiem);
        establecerCiudad(ciu);
        nivelEstudio = nivel;
        centroEducativo = centro;
        valorCarrera = valCar;
    }

    @Override
    public void establecerCiudad(String ciu) {
        ciudad = ciu.toUpperCase();
    }

    public void establecerNivelEstudio(String niv) {
        nivelEstudio = niv;
    }

    public void establecerCentroEducativo(InstitucionEducativa cen) {
        centroEducativo = cen;
    }

    public void establecerValorCarrera(double valCarre) {
        valorCarrera = valCarre;
    }

    public void calcularValorMensual() {
        double porcentaje = ((valorCarrera / tiemPres) * 10) / 100;
        valorMensual = (valorCarrera / tiemPres) - porcentaje;
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("Prestamo Educativo\n%s"
                + "Nivel de Estudio: %s\n"
                + "Nombre de la Institución: %s\n"
                + "Siglas: %s\n"
                + "Valor de la Carrera: %.2f\n"
                + "Valor Mensual: %.2f\n"
                + "------------------------------------",
                super.toString(),
                nivelEstudio,
                centroEducativo.obtenerNombreInst(),
                centroEducativo.obtenerSiglas(),
                valorCarrera,
                valorMensual);
        return cadena;
    }
}
